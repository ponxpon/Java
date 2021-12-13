// 第1章 文字列の操作 1.7練習問題 p48
// 練習 1-1

package String;

public class String10 {
	public static void main(String[] args) {
		// 1から100までの整数をカンマで連結した文字列sを生成する
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i+1).append(",");
		}

		// 完成した文字列sをカンマで分割し、String配列aに格納
		String s = sb.toString();
		String[] a = s.split(",");

		System.out.println(s);
	}
}
