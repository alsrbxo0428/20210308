package inheritance;

public class Student extends Person {
	public String major;
	public int grade;
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
	}
	
	public void getInfo(String finish) {
		super.getInfo();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println(finish);
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
