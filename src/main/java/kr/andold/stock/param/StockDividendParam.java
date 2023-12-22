package kr.andold.stock.param;

import java.util.List;

import kr.andold.stock.domain.StockDividendDomain;
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
public class StockDividendParam extends StockDividendDomain {
	private List<String> codes;

	private List<StockDividendDomain> creates;
	private List<StockDividendDomain> duplicates;
	private List<StockDividendDomain> updates;
	private List<StockDividendDomain> removes;

	@Override
	public String toString() {
		return String.format("StockDividendParam(creates: #%d, duplicates: #%d, updates: #%d, removes: #%d)",
			Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
	}

}
