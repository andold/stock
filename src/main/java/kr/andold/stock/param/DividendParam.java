package kr.andold.stock.param;

import java.util.List;

import kr.andold.stock.domain.DividendDomain;
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
public class DividendParam extends DividendDomain {
	private List<String> codes;

	private List<DividendDomain> creates;
	private List<DividendDomain> duplicates;
	private List<DividendDomain> updates;
	private List<DividendDomain> removes;

	@Override
	public String toString() {
		return String.format("DividendParam(creates: #%d, duplicates: #%d, updates: #%d, removes: #%d)",
			Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
	}

}
