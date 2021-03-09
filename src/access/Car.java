package access;

public class Car {
	private int speed, gas;
	private String owner;
	
	public Car(int speed, int gas, String owner) {
		this.speed = speed;
		this.gas = gas;
		this.owner = owner;
	}

	public void getCarInfo() {
		System.out.println("속도 : " + this.speed);
		System.out.println("연료 : " + this.gas);
		System.out.println("주인 : " + this.owner);
	}
	
	public void carAccel() {
		System.out.println("액셀을 밟습니다.");
		if(this.gas > 0) {
			this.speed += 10;
			this.gas -= 2;
			if(this.gas < 0) this.gas = 0;
		} else {
			System.out.println("연료가 부족합니다.");
		}
	}
	public void carBreak() {
		System.out.println("브레이크를 밟습니다.");
		if(this.speed > 0) {
			this.speed -= 10;
			if(this.speed < 0) this.speed = 0;
		} else {
			System.out.println("자동차가 이미 정지상태입니다.");
		}
	}
}
