// 第1章 文字列の操作 基本的な文字列操作 p28
// 1-3 文字列切り出しメソッドを利用した例

package String;

public class String03 {
	public static void main(String[] args) {
		String s1 = "Java programming";

		// Stringクラスに備わる文字列切り出しのメソッド
		// substring：指定位置から始まる文字列を任意の長さだけ切り出す
		System.out.println("文字列s1の3文字目以降は" + s1.substring(3)); // a programming

		System.out.println("文字列s1の3〜8文字目は" + s1.substring(3, 8)); // a pro
	}
}
