// 第3章 コレクション 3.1コレクションとは p84 3.2.4イテレータ
// 3-2

package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection02 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");
		Iterator<String> it = names.iterator();
	}
}
