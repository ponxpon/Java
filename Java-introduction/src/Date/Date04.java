// 第2章 日付と時間の取り扱い 2.3Time API p64
// 2-4 各種日時クラスのメソッド利用例

package Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date04 {
	public static void main(String[] args) {
		// 文字列からLocalDateを生成
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2011/08/21", f);

		// 100日後を計算する
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("1000日後は" + str);

		// 現在日付との比較
		LocalDate now = LocalDate.now();
		if (now.isAfter(d)) {
			System.out.println("nowはdより新しい");
		}
	}
}
