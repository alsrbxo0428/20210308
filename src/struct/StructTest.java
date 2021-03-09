package struct;

public class StructTest {
	
	//아래 메소드를 완성시켜주세요.
	//structEx타입 자료를 입력받아 4개의 변수를
	//전부 콘솔창에 찍어줍니다.
	public static void getWarriorStatus(StructEx ac) {
		System.out.println("전사 아이디 조회중...");
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("체력 : " + ac.hp);
		System.out.println("공격력 : " + ac.atk);
		System.out.println("==============================");
	}
	
	public static void getMagicianStatus(MagicianEx ac) {
		System.out.println("마법사 아이디 조회중...");
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("체력 : " + ac.hp);
		System.out.println("마나 : " + ac.mp);
		System.out.println("==============================");
	}
	
	//전사에게 몬스터 사냥기능 추가
	public static void huntMonster(StructEx ac) {
		System.out.println("전사가 몬스터를 잡습니다.");
		ac.hp -= 3;
		ac.level += 1;
		System.out.println("==============================");
	}
	
	public static void main(String[] args) {
		StructEx w1 = new StructEx();
		//w1 내부 변수에 임의의 값을 부여해주세요.
		
		w1.id = "전사1";
		w1.level = 1;
		w1.hp = 20;
		w1.atk = 3;
		
		getWarriorStatus(w1);
		
		StructEx w2 = new StructEx();
		
		w2.id = "전사2";
		w2.level = 2;
		w2.hp = 50;
		w2.atk = 3;
		
		getWarriorStatus(w2);
		
		MagicianEx m1 = new MagicianEx();
		
		m1.id = "마법사";
		m1.level = 1;
		m1.hp = 15;
		m1.mp = 50;
		
		getMagicianStatus(m1);
		
		getWarriorStatus(w1);
		huntMonster(w1);
		getWarriorStatus(w1);
		huntMonster(w1);
		getWarriorStatus(w1);
	}
}
