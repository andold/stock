package kr.andold.stock.param;

import java.util.Date;
import java.util.List;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DividendHistoryParam extends DividendHistoryDomain {
	private Date start;
	private Date end;
	private List<String> codes;

	private List<DividendHistoryDomain> creates;
	private List<DividendHistoryDomain> duplicates;
	private List<DividendHistoryDomain> updates;
	private List<DividendHistoryDomain> removes;

	@Override
	public String toString() {
		return String.format("DividendHistory(start: %s, end: %s, codes: #%d, creates: #%d, duplicates: #%d, updates: #%d, removes: #%d, ...)",
				start, end, Utility.size(codes), Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
	}

}
