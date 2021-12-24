// 第2章 日付と時間の取り扱い 2.3Time API p65 2.3.5時間や期間を表すクラス
// 2-5 Periodクラスの利用例

package Date;

import java.time.LocalDate;
import java.time.Period;

public class Date05 {
	public static void main(String[] args) {
		LocalDate d1 =LocalDate.of(2012, 1, 1);
		LocalDate d2 =LocalDate.of(2012, 1, 4);

		// Periodクラス：日数ベースで期間を管理する
		// 3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);

		// d2のさらに3日後を計算する
		LocalDate d3 = d2.plus(p2);
	}
}
