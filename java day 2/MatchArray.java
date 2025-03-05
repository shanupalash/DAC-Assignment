
public class MatchArray {
	public static void main(String args[]) {
		int [] arr1 = {50,40,30,20,10};
		int [] arr2 = {50,40,30,20,10};
		
		
		for(int i =0;i<5;i++) {
			arr1[i]=arr2[i];
		}
		System.out.println("similar Array");
	}

}
