package kr.andold.stock.param;

import java.util.Date;
import java.util.List;

import kr.andold.stock.domain.StockDividendHistoryDomain;
import kr.andold.stock.domain.StockPriceDomain;
import kr.andold.stock.service.Utility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
public class StockPriceParam extends StockPriceDomain {
	private Date start;
	private Date end;

	private List<StockDividendHistoryDomain> creates;
	private List<StockDividendHistoryDomain> duplicates;
	private List<StockDividendHistoryDomain> updates;
	private List<StockDividendHistoryDomain> removes;

	@Override
	public String toString() {
		return String.format("StockPriceDomain(start: %s, end: %s, creates: #%d, duplicates: #%d, updates: #%d, removes: #%d, %s)",
				getStart(), getEnd(), Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes), super.toString());
	}

}
