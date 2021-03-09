package polymoph;

public class Child2 extends Parent {
	@Override
	public void showNum() {
		System.out.println("자식2의 showNum입니다.");
		System.out.println(super.getNum());
		System.out.println("=================");
	}
}
