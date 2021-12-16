// 第2章 日付と時間の取り扱い 2.1日付取り扱いの基本 p53
// 2-1

package Date;

import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		// 現在の日時を取得
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(131622225935L);
		System.out.println(past);
	}
}
