// 第1章 文字列の操作 正規表現の活用 p38
// 1-6 文字列パターンを用いたプレーヤー名のチェック

package String;

public class String06 {
	boolean isValidPlayerName(String name) {
		// matchesメソッド：文字列がパターンに従った形式を満たしている（マッチする）かを照合する
		return name.matches("[A-Z][A-Z0-9]{7}"); // matches("文字列パターン")
	}
}
