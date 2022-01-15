// 第4章 インスタンスの基本操作 4.3_インスタンスの等価評価 p116 4.3.2_equals()のオーバーライド
// 4-2 銀行口座クラスのequals()をオーバーライドする

package instance;

// equals()メソッド：2つの変数が入っているインスタンスを比較して等価であるかを判定する。
// 等価：指している2つのものが「同じ内容」であること（同じアドレスをさしていなくてもよい）
// 等値：指している2つのものが「完全に同一の内容」であること（つまり同じアドレスを指していること）
public class Instance02 {
	// 口座番号（先頭に空白が入ることもある）
	String accountNo;

	// 引数はObject型にすること
	public boolean equals(Object o) {
		// 1.自分自身が引数として渡された場合、無条件でtrueを返す
		if(o == this) return true;

		// 2.nullが引数として渡された場合、無条件でfalseを返す
		if(o == null) return false;

		// 3.比較し型が異なるならば、falseを返す（同じなら4のif文に備え、比較できるよう適切にキャストする）
		if(!(o instanceof Instance02)) return false;
		Instance02 r =(Instance02) o;

		// 4.2つのインスタンスが持つしかるべきフィールド同士を比較して等価か判定し、trueかfalseを返す。
		// 先頭と末尾の空白を取り除いた口座番号が等しければ、等価とみなす
		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;
	}
}
