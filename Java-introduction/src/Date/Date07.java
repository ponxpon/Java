// 第2章 日付と時間の取り扱い 2.5練習問題 p68
// 練習 2-2 練習2-1と同様の動作を行うプログラムをJava8以降で利用可能になった新しいTime APIを用いて記述する。

package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date07 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(f));
	}
}
