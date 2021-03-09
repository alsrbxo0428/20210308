package polymoph;

public class Monster {
	private int hp, atk, def;

	//생성자
	public Monster(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public void setHp(int dmg) {
		this.hp -= dmg;
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
	
	public void showHp() {
		System.out.println("해당 몬스터의 체력 : " + this.hp);
	}
}