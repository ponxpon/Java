// 第1章 文字列の操作
// 1-1 文字列調査メソッドを利用した例

public class String01 {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		// Stringクラスに備わる文字列調査のメソッド
		// equalsメソッド：内容が等しいか調べる。
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}

		// equalsIgnoreCaseメソッド：大文字、小文字（文字のケース）を区別せず、内容が等しいか調べる。
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}

		// length()メソッド：文字列長を調べる。
		System.out.println("s1の長さは" + s1.length() + "です");

		// isEmpty()メソッド：空文字かを調べる。
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
	}
}
