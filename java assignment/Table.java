package corejava;

import java.util.Scanner;

public class Table {
	

	private static void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" ="+num*i);
		}
		
		
	}

	
	public static void main(String args[]) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number To Print Table");
		num = s.nextInt();
		
		
		
		printTable(num);
	}

}
