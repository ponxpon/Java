// 第3章 コレクション 3.6_コレクションの応用 p104 3.6.2_要素の参照に注意
// 3-9 コレクションへ格納が終わった変数のインスタンスの中身を書き換えると、コレクションに格納済みの要素の中身も書き換わる

package collection;

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}

public class Collection09 {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		List<Hero> list = new ArrayList<Hero>();

		// hをリストに格納
		list.add(h);

		// 格納後にhを置き換え
		h.name = "スガワラ";

		// 中身はスガワラ
		System.out.println(list.get(0).name);
	}
}


