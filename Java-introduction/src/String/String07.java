// 第1章 文字列の操作 1.4 正規表現の活用 p42
// 1-7 split()メソッドを使った文字列の分割

package String;

public class String07 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";

		// split()メソッド：文字列の分割
		String[] words = s.split("[,:]"); // split("[カンマかコロンの場所で文字列を分割]")
		for(String w : words) {
			System.out.print(w + "->");
		}
	}
}
