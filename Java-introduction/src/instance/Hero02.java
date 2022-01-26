// 第4章 インスタンスの基本操作 4.6_インスタンスの複製 p131 4.6.2_Clone()メソッド
// 4-8 Clone()による複製をサポートしたHeroクラス

package instance;

public class Hero02 implements Cloneable {
	// 名前
	String name;
	// HP
	int hp;
	// 装備している剣
	// Sword sword;

	/* ： */

	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		// result.hp = this.hp;
		// result.sword = this.sword;
		return result;

	}
}
