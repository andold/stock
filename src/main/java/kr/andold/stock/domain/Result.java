package kr.andold.stock.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
	private STATUS status;
	private T result;

	public static enum STATUS {
		SUCCESS
		, NO_MORE_DATA
		, FAIL
			, FAIL_NO_RESULT
			, FAIL_NO_DATA
			, FAIL_MANY_DATA
		, EXCEPTION
		, NOT_SUPPORT
	}

}
