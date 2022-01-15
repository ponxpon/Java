// 第4章 インスタンスの基本操作 4.3_インスタンスの等価評価 p116 4.3.2_equals()のオーバーライド
// 4-2 銀行口座クラスのequals()をオーバーライドする

package instance;

// equals()メソッド：2つの変数が入っているインスタンスを比較して等価であるかを判定する。
// 等価：指している2つのものが「同じ内容」であること（同じアドレスをさしていなくてもよい）
// 等値：指している2つのものが「完全に同一の内容」であること（つまり同じアドレスを指していること）
public class Instance02 {
	// 口座番号（先頭に空白が入ることもある）
	String accountNo;

	public boolean equals(Object o) {
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Instance02)) return false;
		Instance02 r =(Instance02) o;
		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}
}
