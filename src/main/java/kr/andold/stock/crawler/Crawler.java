package kr.andold.stock.crawler;

import java.util.Date;
import java.util.List;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.service.ParserService.ParserResult;

public interface Crawler {
	public Result<ParserResult> dividend(ItemDomain item, Date start);
	public Result<ParserResult> price(ItemDomain item, List<DividendHistoryDomain> histories);
	
}
