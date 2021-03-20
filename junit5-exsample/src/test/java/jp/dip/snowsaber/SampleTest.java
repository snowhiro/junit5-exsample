package jp.dip.snowsaber;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.dip.snowsaber.Sample;

public class SampleTest {

	@Test
	void sample() {
		Sample sample = new Sample();
		int a = 1;
		int b = 4;

		// テスト対象処理
		int actual = sample.addition(a, b);

		// 期待値
		int expected = 5;
		// 検証
		assertEquals(expected, actual);

	}

}
