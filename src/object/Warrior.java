package object;

public class Warrior {
	//전사가 사용 할 스택을 적어주세요.
	private String id;
	private int level, hp, atk;
	
	public Warrior(String userId) {
		level = 1;
		hp = 30;
		atk = 10;
		id = userId;
	}
	
	public void getStatus() {
		System.out.println("아이디 : " + id);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + atk);
	}
	
	public void huntMonster() {
		System.out.println("전사가 몬스터를 잡습니다.");
		hp -= 3;
		level += 1;
	}

	public void heal() {
		System.out.println("전사가 체력을 회복합니다.");
		hp = 30;
	}
}