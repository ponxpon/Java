// 第1章 文字列の操作 正規表現の活用 p36
// 1-5 正当なプレイヤー名であるかを判定するメソッド

// プレイヤー名の条件 ・必ず8文字で、使える文字はA〜Zと0〜9だけ ・最初の文字に数字は使えない
public class String05 {
	boolean isValidPlayerName(String name) {
		// 文字数が8文字であること
		if (name.length() != 8) {
			return false;
		}

		char first = name.charAt(0);

		// 最初の一文字はA〜Z
		if (!(first >= 'A' && first <= 'Z')) {
			return false;
		}

		for (int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			// 以降の文字はA〜Zか0〜9
			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}
		return true;
	}
}
