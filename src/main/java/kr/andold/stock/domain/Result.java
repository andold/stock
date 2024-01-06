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
	public static final STATUS SUCCESS = STATUS.SUCCESS;
	public static final STATUS NO_MORE_DATA = STATUS.NO_MORE_DATA;
	public static final STATUS FAIL = STATUS.FAIL;
	public static final STATUS EXCEPTION = STATUS.EXCEPTION;

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
	}
}
