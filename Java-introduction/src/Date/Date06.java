// 第2章 日付と時間の取り扱い 2.5練習問題 p68
// 練習 2-1 「現在の100日後の日付」を「西暦2011年09月24日」という形式で表示するプログラムを作成する。

package Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date06 {
	public static void main(String[] args) {
		// 1.現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();

		// 2.取得した日時情報をCalendarnにセット
		c.setTime(now);

		// 3.Calensarから「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);

		// 4.取得した値に100を足してCalendarにセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);

		// 5.Calendarの日付情報をDate型に変換
		Date future = c.getTime();

		// 6.指定された形式で表示
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");

		System.out.println(f.format(future));
		// 2021/12/25 → 実行.西暦2022年04月04日
	}
}
