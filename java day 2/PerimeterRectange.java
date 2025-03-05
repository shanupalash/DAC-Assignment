import java.util.Scanner;

public class PerimeterRectange {
	
	public static int takeInput() {
		System.out.println("Enter Value");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	} 
	
	public int area(int x,int y) {
		return x*y;
		
	}
	public int peri(int a ,int b) {
		return (a+b)*2;
	}
	
	public void showOutput(double x) {
		System.out.println("result is :"+x);
		
	}
	
public static void main(String args[]) {
	int len=takeInput();
	int bred=takeInput();
	
	PerimeterRectange p = new PerimeterRectange();
	
	double area = p.area(len, bred);
	double peri = p.peri(len, bred);
	p.showOutput(area);
	p.showOutput(peri);
	
}

}
