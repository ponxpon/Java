// 第3章 コレクション 3.8_練習問題 p108
// 練習3-3 勇者2名（斉藤、鈴木）をインスタンス化し、それぞれの勇者が倒した敵の数（3、7）と勇者をペアでコレクションに格納する。次に1つずつ取り出し、画面表示を行う。

package collection;

import java.util.HashMap;
import java.util.Map;

public class Hero02 {
	private String name;
	public Hero02(String name) { this.name = name; }
	public String getName() { return this.name; }

	public static void main(String[] args) {
		Hero02 h1 = new Hero02("斉藤");
		Hero02 h2 = new Hero02("鈴木");
		Map<Hero02, Integer> heroes = new HashMap<Hero02, Integer>();
		heroes.put(h1, 3);
		heroes.put(h2, 7);
		for(Hero02 key : heroes.keySet()) {
			int value = heroes.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}
}
// 実行結果
// 斉藤が倒した敵=3
// 鈴木が倒した敵=7
