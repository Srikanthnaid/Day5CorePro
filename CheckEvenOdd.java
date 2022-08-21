/**
 *  @author srikanth naidu
 *  Even number means which is divisible by 2 Reminder is 0.
 *  example
 *  	2)8(4
 *  	_|8_|__
 *  	  0
 *  Even = n%2 == 0;
 *  Odd number means which is divisible by 2 that gets Reminder not equals to 0.
 *  example
 *  	2)5(2
 *     _|_4_|_
 *  	  1	
 *   Odd = n%2 !=0;
 */		 

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number:");
		int n = in.nextInt();
		boolean even;
		boolean odd;
		even = n%2 ==0;
		odd = n%2 !=0;
		System.out.println("even: "+even);
		System.out.println("odd : "+odd);

	}

}
