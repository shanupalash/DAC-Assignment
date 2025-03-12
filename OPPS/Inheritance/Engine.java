
public class Engine {
	
	int engineModle ;
	int horsePower;
	float engineCapacity;
	String engineName;
	
	public Engine(int engineModle, int horsePower, float engineCapacity, String engineName) {
		this.engineModle = engineModle;
		this.horsePower = horsePower;
		this.engineCapacity = engineCapacity;
		this.engineName = engineName;
	}
	public void startEngine() {
		System.out.println("Ëngine Started ");
	}
	void dispalyEngine() {
		System.out.println("Engine Name :"+engineName );
		System.out.println("Engine Modle :"+engineModle );
		System.out.println("Engine Capacity :"+engineCapacity+"L" );
		System.out.println("Engine Hourse Power :"+horsePower );
	}
	
	

}
