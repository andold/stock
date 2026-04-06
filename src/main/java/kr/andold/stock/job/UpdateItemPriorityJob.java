package kr.andold.stock.job;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.JobService.Job;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Builder
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Service
public class UpdateItemPriorityJob implements Job {
	@Builder.Default @Getter private Long timeout = 60L;
	
	@Autowired private ItemService itemService;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} UpdateItemPriorityJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		UpdateItemPriorityJob that = (UpdateItemPriorityJob) ApplicationContextProvider.getBean(UpdateItemPriorityJob.class);
		STATUS result = that.main();

		log.debug("{} 『#{}』 UpdateItemPriorityJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	protected STATUS main() {
		log.debug("{} UpdateItemPriorityJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		try {
			Set<ItemDomain> set = new HashSet<>();
			List<ItemDomain> items = itemService.search(ItemParam.builder().build());
			for (ItemDomain item : items) {
				Integer priority = item.getPriority();
				Date ipoClose = item.getIpoClose();
				if (ipoClose != null && priority < 12) {
					set.add(item);
					item.setPriority(12);
				}

				String type = item.getType();
				if (type != null && (type.contains("기타비상장") || type.contains("KONEX") || type.contains("K-OTC")) && priority < 9) {
					set.add(item);
					item.setPriority(9);
				}
			}

			List<ItemDomain> updates = new ArrayList<>(set);
			List<ItemDomain> updated = itemService.update(updates);

			log.debug("{} 『{}:{}/{}』 UpdateItemPriorityJob::main() - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(updated), Utility.size(updates), Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 UpdateItemPriorityJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque) {
		if (containsOrModify(JobService.getQueue0())) {
			return;
		}
		if (containsOrModify(JobService.getQueue1())) {
			return;
		}
		if (containsOrModify(JobService.getQueue2())) {
			return;
		}
		if (containsOrModify(JobService.getQueue3())) {
			return;
		}

		deque.addLast(UpdateItemPriorityJob.builder().build());
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque) {
		for (Job job : deque) {
			if (containsOrModify(job)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job) {
		if (!(job instanceof UpdateItemPriorityJob)) {
			return false;
		}

		return true;
	}

}
