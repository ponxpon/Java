// 第3章 コレクション 3.4_さまざまなコレクションクラス p97 3.4.3_Setの実装バリエーション
// 3-6 String型の複数の文字列をTreeSetに格納すると、辞書順に取り出せる

package collection;

import java.util.Set;
import java.util.TreeSet;

public class Collection06 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for(String s : words) {
			System.out.print(s + "→");
		}
	}
}
// 実行結果
// cat→dog→panda→wolf→
