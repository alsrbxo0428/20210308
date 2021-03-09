package polymoph;

public class GameMain {
	public static void main(String[] args) {
		Warrior w = new Warrior(20, 3, 1);
		Orc orc1 = new Orc();
		Orc orc2 = new Orc();
		Dragon d1 = new Dragon();
		Dragon d2 = new Dragon();
		Goblin g1 = new Goblin();
		Troll t1 = new Troll();
		
		w.hunt(orc1);
		w.hunt(d1);
		w.hunt(g1);
		w.hunt(t1);
		
		w.showHp();
		orc1.showHp();
		orc2.showHp();
		d1.showHp();
		d2.showHp();
		g1.showHp();
		t1.showHp();
	}//main
}
