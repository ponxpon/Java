// 第1章 文字列の操作 1.4 正規表現の活用 p42
// 1-8 replaceAll()メソッドを使った文字列の置換

public class String08 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";

		// replaceAll()メソッド：文字列中でパターンに一致した箇所を別の文字列に置換できる
		String w = s.replaceAll("[deh]", "X");
		System.out.print(w);
	}
}

// replaceFirst()メソッド：最初の一つだけを置換する
