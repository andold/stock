package kr.andold.stock.param;

import java.util.Date;
import java.util.List;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemParam extends ItemDomain {
	@Getter @Setter private String keyword;
	@Getter @Setter private Date start;
	@Getter @Setter private Float priceEarningsRatio;
	@Getter @Setter private Integer totalPages;
	
	@Getter @Setter private List<ItemDomain> items;

	@Getter @Setter private List<ItemDomain> creates;
	@Getter @Setter private List<ItemDomain> duplicates;
	@Getter @Setter private List<ItemDomain> updates;
	@Getter @Setter private List<ItemDomain> removes;

	@Override
	public String toString() {
		return String.format("ItemParam(keyword: %s, totalPages: #%d, items: #%d, creates: #%d, duplicates: #%d, updates: #%d, removes: #%d, ...)",
				keyword, totalPages, Utility.size(items), Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
	}

}
