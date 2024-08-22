package kr.andold.stock.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.Job;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.utils.Utility;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class JobService {
	@Getter private static ConcurrentLinkedDeque<Job> queue0 = new ConcurrentLinkedDeque<>();
	@Getter private static ConcurrentLinkedDeque<Job> queue1 = new ConcurrentLinkedDeque<>();

	public static class NetworkUsage {
		private LocalDateTime time;
		private int bytes;

		public NetworkUsage() {
			this.time = LocalDateTime.now();
			this.bytes = bytes();
		}

		private int bytes() {
			try {
				String filename = "/proc/net/dev";
				String content = new String(Files.readAllBytes(Paths.get(filename)));
				int bytes = 0;
				for (String line : content.split("\n")) {
					String normalized = line.strip().replaceAll("[\\s]+", "\t");
					String[] words = normalized.split("\t");
					try {
						bytes += Integer.parseInt(words[1]);
					} catch (Exception e) {
					}
				}

				return bytes;
			} catch (IOException e) {
			}

			return 0;
		}

		public int pause(int bps) {
			LocalDateTime currentTime = LocalDateTime.now();
			int currentBytes = bytes();
			int usage = (currentBytes - this.bytes) * 8;	//	unit: bits
			int seconds = (int) (currentTime.toEpochSecond(Utility.ZONE_OFFSET_KST) - this.time.toEpochSecond(Utility.ZONE_OFFSET_KST));
			int millis = (usage - bps * seconds) * 1000 / bps;
			return Math.max(millis, 0);
		}
	}

	@Async
	public void run() {
		log.info("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

		for (int cx = 0;; cx++) {
			try {
				NetworkUsage startedNetworkUsage = new NetworkUsage();
				STATUS result = run(cx);

				int mills = startedNetworkUsage.pause(1024 * 1024 * 8 / 60); // 1분(60초)에 1 Mbytes 트래픽
				log.info("{} run() - 『{}』『{} {}』『{}』『{} ms』 - {}", Utility.indentMiddle(), cx, size(queue0),
						size(queue1), result, mills, Utility.toStringPastTimeReadable(started));

				Utility.sleep(mills);
				continue;
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			}

			Utility.sleep(1000);
			log.info("{} run() - 『{}』『{} {}』 - {}", Utility.indentMiddle(), cx, size(queue0), size(queue1),
					Utility.toStringPastTimeReadable(started));
		}
	}

	protected STATUS run(int count) {
		log.info("{} run({})", Utility.indentStart(), count);
		long started = System.currentTimeMillis();

		if (queue0.peek() != null) {
			Job job = queue0.pop();
			STATUS result = job.run();

			log.info("{} run({}) - 『{} {}』 - {}", Utility.indentEnd(), result, count, size(queue0), size(queue1), Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (queue1.peek() != null) {
			Job job = queue1.pop();
			STATUS result = job.run();

			log.info("{} run({}) - 『{} {}』 - {}", Utility.indentEnd(), result, count, size(queue0), size(queue1), Utility.toStringPastTimeReadable(started));
			return result;
		}
		
		log.info("{} 『{}』 run({}) - 『{} {}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, count, size(queue0), size(queue1), Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private int size(ConcurrentLinkedDeque<?> q) {
		return (q == null) ? -1 : q.size();
	}

}
