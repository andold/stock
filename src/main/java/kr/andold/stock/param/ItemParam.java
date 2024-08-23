package kr.andold.stock.param;

import java.util.Date;
import java.util.List;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemParam extends ItemDomain {
	private String keyword;
	private Date start;
	private Float priceEarningsRatio;
	private Integer totalPages;
	
	private List<ItemDomain> items;

	private List<ItemDomain> creates;
	private List<ItemDomain> duplicates;
	private List<ItemDomain> updates;
	private List<ItemDomain> removes;

	@Override
	public String toString() {
		return String.format("ItemParam(keyword: %s, totalPages: #%d, items: #%d, creates: #%d, duplicates: #%d, updates: #%d, removes: #%d, ...)",
				keyword, totalPages, Utility.size(items), Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
	}

}
