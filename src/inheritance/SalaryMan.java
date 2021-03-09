package inheritance;

public class SalaryMan extends Person {
	public int salary;
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("연봉 : " + salary);
	}
	
	public void getInfo(String finish) {
		super.getInfo();
		System.out.println("연봉 : " + salary);
		System.out.println(finish);
	}
}
