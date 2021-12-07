// 第1章 文字列の操作 文字列の連結 p30
// 1-4 StringBuilderを利用して文字列を1万回連結する

public class String04 {
	public static void main(String[] args) {
		// StringBuilderインスタンスは内部に連結した文字列を蓄えるメモリ領域を持っている。
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			// append()メソッドを呼んで、メモリ領域（バッファ）にJavaを追加
			sb.append("Java");
		}
		// 最後に一回だけtoString()を呼び、完成した連結済み文字列を取り出す
		String s = sb.toString();
	}
}

// スレッド（複数の処理を同時に行うためのJavaの仕組み）を利用する場合はStringBuilderを利用すると不具合が起こる可能性がある
// そのような場合に、StringBufferクラスを代わりに利用する
