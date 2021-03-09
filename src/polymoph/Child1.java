package polymoph;

public class Child1 extends Parent {
	@Override
	public void showNum() {
		System.out.println("자식1의 showNum입니다.");
		System.out.println(super.getNum());
		System.out.println("=================");
	}
	
	public void test() {
		System.out.println("testing...");
	}
}
