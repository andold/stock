package kr.andold.stock.param;

import java.util.Date;
import java.util.List;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DividendHistoryParam extends DividendHistoryDomain {
	@Getter @Setter private Date start;
	@Getter @Setter private Date end;
	@Getter @Setter private List<String> codes;

	@Getter @Setter private List<DividendHistoryDomain> creates;
	@Getter @Setter private List<DividendHistoryDomain> duplicates;
	@Getter @Setter private List<DividendHistoryDomain> updates;
	@Getter @Setter private List<DividendHistoryDomain> removes;

	@Override
	public String toString() {
		return String.format("DividendHistory(start: %s, end: %s, codes: #%d, creates: #%d, duplicates: #%d, updates: #%d, removes: #%d, ...)",
				start, end, Utility.size(codes), Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
	}

}
