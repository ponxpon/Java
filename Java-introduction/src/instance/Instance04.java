// 第4章 インスタンスの基本操作 4.4_インスタンスの要約 p120 4.4.1_HashSetでremove()できない事態
// 4-4 equals()をオーバーライドしているのにremove()できない

package instance;

import java.util.HashSet;
import java.util.Set;

class Hero1 {
	public String name;
	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Hero1)) return false;
		Hero1 r = (Hero1) o;
		if(!this.name.equals(r.name)) {
			return false;
		}
		return true;
	}
}

public class Instance04 {
	public static void main(String[] args) {
		// HashSetを利用
		Set<Hero1> list = new HashSet<Hero1>();
		Hero1 h1 = new Hero1();
		h1.name = "ミナト";

		// インスタンスを作って格納
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 =new Hero1();
		h1.name = "ミナト";

		// 名前が「ミナト」の勇者を削除
		list.remove(h1);
		System.out.println("要素数=" + list.size());
	}
}
// 実行結果
// 要素数=1
// 要素数=1 0になっていない（削除できていない）
// HeroクラスのhashCode()がオーバーライドされていなかったため、正しくないハッシュコードが返され、epuals()を呼ぶまでもなく削除候補から外されてしまったため。
