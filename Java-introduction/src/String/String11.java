// 第1章 文字列の操作 1.7練習問題 p48
// 練習 1-2 folderとfileを連結して、完全なファイル名としての文字列を完成させるメソッドを作成

package String;

public class String11 {
	String concatPath(String folder, String file ) {
		if(!folder.endsWith("¥¥")) {
			folder += "¥¥";
		}
		return folder + file;
	}
}
