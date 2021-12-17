// 第2章 日付と時間の取り扱い 2.1日付取り扱いの基本 p53
// 2-1

package Date;

// 日付情報を扱う場合にjava.util.Dateクラスを利用する。
import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		// 現在の日時を取得（引数なしでインスタンス化すると現在の日時が格納される）
		Date now = new Date();
		System.out.println(now);

		// getTime()を用いて、インスタンス内に保持するlong値を取得
		System.out.println(now.getTime());
		Date past = new Date(131622225935L);
		System.out.println(past);
	}
}
