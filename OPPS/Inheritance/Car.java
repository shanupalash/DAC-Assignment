
public class Car {
	
	String brand;
	String carName;
	int carModle;
	Engine e;
	
	public Car(String brand, String carName, int carModle, Engine e) {
		
		this.brand = brand;
		this.carName = carName;
		this.carModle = carModle;
		this.e = e;
	}
	void startCar() {
		System.out.println("Key's Inserted");
		 e.startEngine();
	}
	
	void displayCar() {
		System.out.println("Car Brand :"+brand);
		System.out.println("Car Name :"+carName);
		System.out.println("Car Modle :"+carModle);
		e.dispalyEngine();
		
	}
	
	
	

}
