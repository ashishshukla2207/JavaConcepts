package programs;

import java.util.Scanner;

public class EvenOddNumer {

	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		
		System.out.print("Enter the number");
		int num= s1.nextInt();
		
		if(num%2==0) {
			System.out.println("number is even");
		}
		
		else {
			
			System.out.println("odd number");
		}

	}

}
