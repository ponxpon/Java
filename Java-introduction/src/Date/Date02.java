// 第2章 日付と時間の取り扱い 2.3Time API p59
// 2-2 InstantおよびZonedDateTimeの利用例

package Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Date02 {
	public static void main(String[] args) {
		// instantの生成
		Instant i1 = Instant.now(); // 現在日時を取得

		// Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(31920291332L);
		long l = i2.toEpochMilli();

		// ZonedDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now(); // 現在日時を取得
		// 「東京時間2014年1月2日3時4分5秒6ナノ秒」を指定して取得
		ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

		// InstantとZoneDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		// ZonedDateTimeの利用
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());

		// 同じ瞬間の判定には、equals()ではなくisEqual()を使う
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
	}
}
