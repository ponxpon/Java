// 第4章 インスタンスの基本操作 4.4_インスタンスの要約 p124 4.4.3_hashCode()のオーバーライド
// 4-5 HeroクラスでHashCode()をオーバーライドする

package instance;

public class Hero01 {
	String name;
	int hp;
	public int hashCode() {
		// 適当な初期値を決める
		int result = 37;

		// 各フィールドの影響を加える
		result = result * 31 + name.hashCode();
		result = result * 31 + hp;

		// 結果を返す
		return result;
	}
}
