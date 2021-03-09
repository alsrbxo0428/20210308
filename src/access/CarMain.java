package access;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car(0, 2, "민규태");
//		car.owner = "곽한구";
//		System.out.println(car.owner);
		
		car.getCarInfo();
		car.carAccel();
		car.carAccel();
		car.getCarInfo();
		car.carBreak();
		car.carBreak();
		car.carBreak();
		car.carBreak();
		car.getCarInfo();
	}
}
