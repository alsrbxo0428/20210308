package inheritance;

public class AirplaneMain {
	public static void main(String[] args) {
		SuperSonicAirplane ssn = new SuperSonicAirplane();
		
		ssn.speed = 1200;
		ssn.fly();
		
		ssn.speed = 800;
		ssn.fly();
	}
}