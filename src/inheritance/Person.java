package inheritance;

public class Person {
	public String name, job, pnum;
	public int age;
	
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("직업 : " + job);
		System.out.println("전화번호 : " + pnum);
		System.out.println("나이 : " + age);
	}
}
