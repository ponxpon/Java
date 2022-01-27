// 第4章 インスタンスの基本操作 4.6_インスタンスの複製 p131 4.6.2_Clone()メソッド
// 4-8 Clone()による複製をサポートしたHeroクラス

package instance;

public class Hero implements Cloneable {
	// 名前
	String name;
	// HP、MP
	int hp,mp;
	// 装備している剣
	Sword sword;

	public Hero(String name,int hp,int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Hero(String name) {
		this(name,1,1);
	}
	public Hero() {
		this("",1,1);
	}

	// toString()のオーバーライド
	@Override
	public String toString() {
		// ObjectクラスのtoStringをオーバーライド
		return "勇者（名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
	}

	// equals()のオーバーライド
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Hero))
			return false;
		Hero r = (Hero) o;
		if (!this.name.equals(r.name)) {
			return false;
		}
		return true;
	}
	// hasCode()のオーバーライド
	@Override
	public int hashCode() {
		// 適当な初期値を決める
		int result = 37;

		// 各フィールドの影響を加える
		result = result * 31 + name.hashCode();
		result = result * 31 + hp;

		// 結果を返す
		return result;
	}

	// clone()のオーバーライド
	@Override
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}
	public String getName() {
		return this.name;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	public Sword getSword() {
		return this.sword;
	}
}

class Sword implements Cloneable{
	String name;
	public Sword(String name) {
		this.name = name;
	}

	@Override
	public Sword clone() {
		return new Sword(this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
