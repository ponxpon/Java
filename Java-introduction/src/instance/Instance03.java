// 第4章 インスタンスの基本操作 4.3_インスタンスの等価評価 p117 4.3.3_コレクションとequals()
// 4-3 equals()オーバーライドをサボったHeroをコレクションに入れる

package instance;

import java.util.ArrayList;
import java.util.List;

class Hero {
	// equals()をオーバーライドしていない
	public String name;
}

public class Instance03 {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<Hero>();
		Hero h1 = new Hero();
		h1.name = "ミナト";

		// インスタンスを作って格納
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";

		// 名前が「ミナト」の勇者を削除
		list.remove(h1);
		System.out.println("要素数=" + list.size());
	}
}
// 実行結果
// 要素数=1
// 要素数=1 0になってない!（削除できていない）
