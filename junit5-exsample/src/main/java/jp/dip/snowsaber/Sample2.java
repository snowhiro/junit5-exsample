package jp.dip.snowsaber;

public class Sample2 {

	public static enum CalType {

		/** 足し算 */
		ADDITION
		/** 引き算 */
		, SUBTRACTION
		/** 掛け算 */
		, MULTIPLICATION
		/** 割り算 */
		, DIVISION;
	}

	/**
	 * 計算種類に応じて計算し、結果を返却する.
	 * <ul>
	 * <li>足し算 値１+ 値２</li>
	 * <li>引き算 値１- 値２</li>
	 * <li>掛け算 値１* 値２</li>
	 * <li>割り算 値１/ 値２</li>
	 * </ul>
	 * @param calType 種類
	 * @param a 値1
	 * @param b 値2
	 * @return 計算結果
	 */
	public int cal(CalType calType, int a, int b) {
		switch (calType) {
		case ADDITION:
			return a + b;
		case SUBTRACTION:
			return a - b;
		case MULTIPLICATION:
			return a * b;
		case DIVISION:
			return a / b;

		default:
			throw new IllegalArgumentException("unknown parameter");
		}
	}
}
