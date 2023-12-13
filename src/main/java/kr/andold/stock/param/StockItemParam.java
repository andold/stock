package kr.andold.stock.param;

import java.util.List;

import kr.andold.stock.domain.StockItemDomain;
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
public class StockItemParam extends StockItemDomain {
	private String keyword;

	private List<StockItemDomain> creates;
	private List<StockItemDomain> duplicates;
	private List<StockItemDomain> updates;
	private List<StockItemDomain> removes;

	@Override
	public String toString() {
		return String.format("StockItemParam(keyword: %s, creates: #%d, duplicates: #%d, updates: #%d, removes: #%d, %s)",
			getKeyword(), Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes), super.toString());
	}

}
