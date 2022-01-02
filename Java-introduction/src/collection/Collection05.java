// 第3章 コレクション 3.4_さまざまなコレクションクラス p95 3.4.2_java.util.HashSetクラス
// 3-5 1つずつ取り出す場合の順序は不明

package collection;

import java.util.HashSet;
import java.util.Set;

public class Collection05 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();

		// 赤・青・黄の順に格納
		colors.add("赤");
		colors.add("青");
		colors.add("黄");

		for(String s : colors) {
			System.out.print(s + "→");
		}
	}
}
// 実行結果：青→赤→黄→
// 格納の順番と異なっている
