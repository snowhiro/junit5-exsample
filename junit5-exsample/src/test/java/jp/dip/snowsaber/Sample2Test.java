package jp.dip.snowsaber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import jp.dip.snowsaber.Sample2.CalType;


class Sample2Test {

	@ParameterizedTest
	@CsvSource({
		"ADDITION, 1, 2, 3"
		, "SUBTRACTION, 3, 1, 2"
		, "MULTIPLICATION, 3, 5, 15"
		, "DIVISION, 10, 2, 5"
		})
	void calTest(CalType calType, int a, int b, int expected) {
		Sample2 s2 = new Sample2();
		int actual = s2.cal(calType, a, b);
		assertEquals(expected, actual);
	}

}
