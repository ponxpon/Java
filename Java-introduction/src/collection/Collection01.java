// 第3章 コレクション 3.1コレクションとは p68
// 3-1

package collection;

import java.util.ArrayList;

public class Collection01 {
	public static void main(String[] args) {
		// Integer型でArrayListを宣言
		ArrayList<Integer> points = new ArrayList<Integer>();
		// 自動的にIntegerに変換・格納される
		points.add(10);
		points.add(80);
		points.add(75);
		for(int i : points) { // enhanced-for文も利用可能
			System.out.println(i);
		}
	}
}
