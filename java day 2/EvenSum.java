import java.util.Scanner;

public class EvenSum {

	public static int takeInput() {
		System.out.println("Enter number to find sum");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	} 

	public static void main(String[] args) {
		int sum = 0;
		int n = takeInput();
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("sum of even number from 0 to "+n+": "+sum);
	}
}
