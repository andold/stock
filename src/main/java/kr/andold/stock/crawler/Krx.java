package kr.andold.stock.crawler;

import java.util.Date;

import org.springframework.stereotype.Service;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Krx implements Crawler {

	@Override
	public Result<ParserResult> dividend(ItemDomain item, Date start) {
		log.error("{} {} dividend({}, {})", Utility.indentEnd(), "NOT SUPPORTED", item, start);
		return null;
	}

}
