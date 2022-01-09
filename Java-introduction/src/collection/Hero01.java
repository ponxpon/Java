// 第3章 コレクション 3.8_練習問題 p108
// 練習3-2 勇者2名（斉藤、鈴木）をHeroとしてインスタンス化してArrayListに格納し、1つずつ順番に取り出して名前を表示するプログラムを作成

package collection;

import java.util.ArrayList;
import java.util.List;

public class Hero01 {
	private String name;
	public Hero01(String name) { this.name = name; }
	public String getName() { return this.name; }

	public static void main(String[] args) {
		Hero01 h1 = new Hero01("斉藤");
		Hero01 h2 = new Hero01("鈴木");
		List<Hero01> heroes = new ArrayList<Hero01>();
		heroes.add(h1);
		heroes.add(h2);
		for(Hero01 h : heroes) {
			System.out.print(h.getName());
		}
	}
}
