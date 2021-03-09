package polymoph;

public class Warrior {
	private int hp, atk, def;
	
	//생성자
	public Warrior(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public void hunt(Monster monster) {
		monster.setHp(this.atk);
		setHp(monster.getAtk());
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public int getDef() {
		return this.def;
	}
	
	public void setHp(int dmg) {
		this.hp = (this.hp + this.def) - dmg;
	}
	
	public void showHp() {
		System.out.println("전사의 체력 : " + this.hp);
	}
}
