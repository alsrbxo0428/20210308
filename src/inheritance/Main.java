package inheritance;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student();
		SalaryMan sm1 = new SalaryMan();
		
		st1.name = "민규태";
		st1.age = 24;
		st1.job = "Student";
		st1.pnum = "010-3330-2733";
		st1.grade = 1;
		st1.major = "정보통신";
		
		
		sm1.name = "민규태";
		sm1.age = 24;
		sm1.job = "SalaryMan";
		sm1.pnum = "010-3330-2733";
		sm1.salary = 3000;
		
//		System.out.println(st1);
//		System.out.println(sm1);

		//Override
//		st1.getInfo();
//		sm1.getInfo();

		st1.setGrade(4);
		
		//Overloading
		st1.getInfo("================================");
		sm1.getInfo("================================");
	}
}