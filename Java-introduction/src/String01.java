// 第1章 文字列の操作
// 1-1 文字列調査メソッドを利用した例

public class String01 {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s1.isEmpty()) {
			System.out.println("s1はから文字です");
		}
	}
}
