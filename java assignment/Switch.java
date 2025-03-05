import java.util.Scanner;

public class Switch {
	
	public static int takeInput() {
		System.out.println("Enter Month");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	} 

	public static void main(String[] args) {
		int month = takeInput();
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("Number Of days is 31");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("Number Of days is 30");
			break;
		case 2 :
			System.out.println("Number Of days is 28");
			break;
			
		}
			

	}

}
