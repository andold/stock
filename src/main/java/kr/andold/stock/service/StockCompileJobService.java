package kr.andold.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Job;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StockCompileJobService implements Job {
	@Autowired private StockService stockService;
	@Autowired private PriceService priceService;

	@Override
	public STATUS run() {
		log.info("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

		List<ItemDomain> compileResult = stockService.compile();
		int purged = priceService.purge();

		log.info("{} 『#{} #{}』 run() - {}", Utility.indentEnd(), Utility.size(compileResult), purged, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

}
