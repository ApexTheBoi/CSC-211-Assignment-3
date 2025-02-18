public class Test {
	public static void main(String[] args) {
		Automobile[] list = new Automobile[4];

		Automobile A1 = new Automobile();
		Car C1 = new Car("Accord", 2011, "Honda");
		SportsCar S1 = new SportsCar("F-Type", 2024, "Jaguar");
		JunkCar J1 = new JunkCar("Clown Wagon", 1688, "Clown-CO");
		
		System.out.println(A1.toString());
		System.out.println(C1.toString());
		System.out.println(S1.toString());
		System.out.println(J1.toString());
		
		System.out.println("-------------------------------");
		
		System.out.println(A1.compareTo(C1));
		System.out.println(J1.compareTo(S1));
		
		System.out.println("-------------------------------");
		
		A1.honk();
		C1.honk();
		S1.honk();
		J1.honk();
		
		System.out.println("-------------------------------");
		
		C1.accelerate();
		S1.accelerate();
		J1.accelerate();
		
		System.out.println("-------------------------------");
		
		C1.reverse();
		S1.reverse();
		J1.reverse();
		
		System.out.println("-------------------------------");
		
		C1.stop();
		S1.stop();
		J1.stop();
		
		System.out.println("-------------------------------");
		System.out.println("Code has finished.");
	}
}
