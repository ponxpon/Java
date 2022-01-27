// 第4章 インスタンスの基本操作 4.6_インスタンスの複製 p133 4.6.3_複製の失敗
// 4-9 複製した勇者の剣の名前を変更してみる

package instance;

public class Instance06 {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		Sword s = new Sword("はがねの剣");
		h1.setSword(s);
		System.out.println("装備：" + h1.getSword().getName());
		System.out.println("clone()で複製します");
		// ここで複製
		Hero h2 = h1.clone();
		System.out.println("コピー元の勇者の剣の名前を変えます");
		h1.getSword().setName("ひのきの棒");
		System.out.println("コピー元とコピー先の勇者の装備を表示します");
		System.out.println("コピー元："+h1.getSword().getName()+"／コピー先："+h2.getSword().getName());
	}
}

// 実行結果
// 装備：はがねの剣
// clone()で複製します
// コピー元の勇者の剣の名前を変えます
// コピー元とコピー先の勇者の装備を表示します
// コピー元：ひのきの棒／コピー先：ひのきの棒 <- コピー先の装備まで変わってしまった

