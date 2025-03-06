import java.util.Scanner;

public class isPalindrome {
	public static boolean checkPalindrome(String str) {
		int left=0;
		int right =str.length()-1;
		while(left<right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	
	public static String takeInput() {
		System.out.println("Enter String");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		return str;
		
	}
public static void main(String args[]) {
	
		String s = takeInput();
		if(checkPalindrome(s)) {
			System.out.println("given string is palidrome");
			
		}
		else {
			System.out.println("given string is not palidrome");
		}
	
	
}
}
