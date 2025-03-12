
public class CarEngineRelation {

	public static void main(String[] args) {
		
		Engine e = new Engine(1970, 2000, 4, "V6");
		Car c = new Car("Ford", "Mustang", 1970, e);
		
		c.displayCar();
		c.startCar();

	}

}
