// 第4章 インスタンスの基本操作 4.5_インスタンスの順序づけ p126 4.5.2_Comparableインタフェースの実装
// 4-7

package instance;

// < ~ >で自身を指定
public class Account implements Comparable<Account> {
	// 口座番号
	int number;
	/* : */
	// compareTo()メソッド：引数で渡されてきたインスタンスobjと自分自身と比較し、その大小関係を判定する。
	public int compareTo(Account obj) {
		if(this.number < obj.number) {
			return -1;
		}
		if(this.number > obj.number) {
			return 1;
		}
		return 0;
	}
}
