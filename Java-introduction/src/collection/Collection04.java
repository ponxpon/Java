// 第3章 コレクション 3.4さまざまなコレクションクラス p94 3.4.1コレクションの全体像
// 3-4

package collection;

import java.util.HashSet;
import java.util.Set;

public class Collection04 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		// 重複して赤を格納しようとしても無視される
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");
	}
}
