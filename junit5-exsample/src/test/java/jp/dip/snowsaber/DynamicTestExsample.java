package jp.dip.snowsaber;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExsample {

	@TestFactory
	Stream<DynamicTest> 動的なテストケース() {
	    // メソッド内クラスでテストデータを構造化すると使いやすそう
	    class Pattern {
	        String str;
	        boolean expect;
	        Pattern(String str, boolean expect) {
	            this.str = str;
	            this.expect = expect;
	        }
	    }

	    // ラムダ外のスコープの一時変数を維持するためにテストクラスを個別には生成しないのだと思う
	    final List<String> list = new ArrayList<>();

	    return Stream.of(
	            new Pattern("A", true),
	            new Pattern("B", false)

	    ).map(p -> DynamicTest.dynamicTest("test" + p.str, () -> {
	        list.add(p.str);

	        assertEquals(list.size() == 1, p.expect);
	    }));
	}
}
