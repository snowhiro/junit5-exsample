package jp.dip.snowsaber;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertEqualsSampleTest {

	@Test
	@DisplayName("assertEqualsのサンプル")
	void assertEqualsTest() {
		// 文字列のassert
		String expected = "AAA"; // 期待値
		String actual = "AAA"; // 実際の値
		assertEquals(expected, actual, "文字列の比較テスト");

		// boolean型の比較
		assertTrue(true);
		assertFalse(false);

		// nullのチェック
		assertNull(null);
		assertNotNull("aaaa");

	}

	// 例外確認用のテスト対象クラス
	static class ExceptionTestSample {
		static String call(String value) {
			if (value == null) {
				throw new IllegalArgumentException("値が設定されていません");
			}
			return "設定値" + value;
		}
	}

	@Test
	@DisplayName("例外の確認")
	void assertEqualsExceptionTest() {
		assertEquals("設定値AAA", ExceptionTestSample.call("AAA"));

		// 発生した例外は戻り値として取得ができる
		IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> {
			ExceptionTestSample.call(null);
		});
		assertEquals("値が設定されていません", iae.getMessage());

	}


}
