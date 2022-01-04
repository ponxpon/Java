// 第3章 コレクション 3.5_Mapの使い方 p100 3.5.2_HashMapクラスの利用
// 3-7

package collection;

import java.util.HashMap;
import java.util.Map;

public class Collection07 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();

		// ペアで値を格納
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);

		// キーを指定して値を所得
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、" + tokyo);

		// 値を（182）に上書き
		prefs.put("熊本県", 182);

		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、" + kumamoto);
	}
}
// 実行結果
// 東京都の人口は、1261
// 熊本県の人口は、182 値が上書きされた
