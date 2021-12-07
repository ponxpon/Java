// 第1章 文字列の操作 基本的な文字列操作 p27
// 1-2 文字列検索メソッドを利用した例

public class String02 {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";

		// Stringクラスに備わる文字列検索のメソッド
		// contains：一部に文字列sを含むかを調べる
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}

		// endsWith：文字列sで終わるかを調べる
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}

		// indexOf：文字chが最初に登場する位置を調べる
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));

		// lastIndexOf：文字chを後ろから検索して最初に登場する位置を調べる
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}
}
