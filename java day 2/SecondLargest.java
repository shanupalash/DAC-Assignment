import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
	public static int takeInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	} 
	public static void main(String args[]) {
		
		System.out.println("Enter size of array");
		int size= takeInput();
		int [] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter number to Store");
			arr[i]=takeInput();
	}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	System.out.println("Second largest Element is "+arr[size-2]);
	

}
}
