// 第3章 コレクション 3.5_Mapの使い方 p101 3.5.3_HashMapの中身を1つずつ取り出す
// 3-8

package collection;

import java.util.HashMap;
import java.util.Map;

public class Collection08 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);

		// 県名一覧を取得し繰り返す
		for (String key : prefs.keySet()) {
			// 県名を指定し人口を取得
			int value = prefs.get(key);
			System.out.println(key + "の人口は、" + value);
		}
	}
}
