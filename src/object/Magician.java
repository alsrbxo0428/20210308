package object;

public class Magician {
	
	private String id;
	private int level, hp, mp;
	
	public Magician(String userId) {
		level = 1;
		hp = 10;
		mp = 30;
		id = userId;
	}
	
	public void getStatus() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
	}
	
	public void huntMonster() {
		System.out.println("마법사가 몬스터를 잡습니다.");
		hp -= 2;
		level += 1;
	}
	
	public void heal() {
		System.out.println("마법사가 체력을 회복합니다.");
		hp = 10;
	}
}
