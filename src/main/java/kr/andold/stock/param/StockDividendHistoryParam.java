package kr.andold.stock.param;

import java.util.Date;
import java.util.List;

import kr.andold.stock.domain.StockDividendHistoryDomain;
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
public class StockDividendHistoryParam extends StockDividendHistoryDomain {
	private String keyword;
	private Date start;
	private Date end;
	private String type;
	private Boolean etf;

	private List<StockDividendHistoryDomain> creates;
	private List<StockDividendHistoryDomain> duplicates;
	private List<StockDividendHistoryDomain> updates;
	private List<StockDividendHistoryDomain> removes;

	@Override
	public String toString() {
		return String.format("StockDividendHistoryParam(keyword: %s, creates: #%d, duplicates: #%d, updates: #%d, removes: #%d, %s)",
			getKeyword(), Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes), super.toString());
	}

}
