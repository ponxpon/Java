// 第4章 インスタンスの基本操作 4.2_インスタンスの文字列表現 p114 4.2.2_toString()をオーバーライドする
// 4-1 toString()メソッドのオーバーライド
package instance;

public class Instance01 {
	private String name;
	private int hp, mp;

	// toString()メソッド：インスタンスの内容を、人が読んで理解できる文字列で表現したもの（文字列表現）として返す
	public String toString() {
		// ObjectクラスのtoStringをオーバーライド
		return "勇者（名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
	}
}
