package kr.andold.stock.service;

public class Utility extends kr.andold.utils.Utility {

	public static int compareFloat(Float left, Float right, Float epsilon) {
		if (left == null && right == null) {
			return 0;
		}
		if (left == null) {
			return -1;
		}
		if (right == null) {
			return 1;
		}
		
		Float delta = Math.abs(left - right);
		if (delta < epsilon) {
			return 0;
		}
		
		if (delta < 0) {
			return -1;
		}

		return 1;
	}

}
