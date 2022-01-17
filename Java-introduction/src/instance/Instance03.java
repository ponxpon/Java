// 第4章 インスタンスの基本操作 4.3_インスタンスの等価評価 p116 4.3.3_コレクションとequals()
// 4-3 equals()オーバーライドをサボったHeroをコレクションに入れる

package instance;

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}

public class Instance03 {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<Hero>();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero();
		list.remove(h1);
		System.out.println("要素数=" + list.size());
	}
}
