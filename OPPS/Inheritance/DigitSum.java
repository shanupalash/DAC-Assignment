import java.util.Scanner;

public class DigitSum {
		
	public static void checkProd(int num) {
		int prod = 1;
        while (num > 0) {
            int num2 = num % 10;
            prod *= num2;
            num /= 10;
        }
		System.out.println(prod);
		
	}
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		System.out.println("Enter num");
		int num =scn.nextInt();
		scn.close();
		
		checkProd(num);
		
	}

	
}
