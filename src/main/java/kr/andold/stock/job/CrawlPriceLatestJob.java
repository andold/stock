package kr.andold.stock.job;

import org.springframework.stereotype.Service;

import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class CrawlPriceLatestJob implements Job {
	@Builder.Default @Getter private Long timeout = 4L;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlPriceLatestJob::call()", Utility.indentStart());

		JobService.getQueue2().addLast(CrawlPriceLatestSeibroCompanyExcelJob.builder().build());
		JobService.getQueue2().addLast(CrawlPriceLatestSeibroEtfJob.builder().build());

		log.debug("{} 『#{}』 CrawlPriceLatestJob::call()", Utility.indentEnd(), STATUS.SUCCESS);
		return STATUS.SUCCESS;
	}

}
