package polymoph;

public class PCMain {
	public static void getPc(Parent parent) {
		parent.showNum();
//		parent.test();
	}
	
	public static void main(String[] args) {
		//하단에 child1(child1타입)
		//child2(child2타입)
		//parent(parent타입)을 생성해주세요.
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		Parent parent = new Parent();
		getPc(parent);
		getPc(child1);
		getPc(child2);
	}
}
