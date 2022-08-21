/**
 * @author srikanth naidu
 * Leapyear coming after 4 years
 * decade years is divisible 400
 * 		2000/400 
 * non_decade years is divisible by 4
 * 			2024%4
 */
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int Years  ;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the Year : ");
		int years = sc.nextInt();
		if( years%400==0 ||  years%4==0)
		{
			System.out.println("It is a leap year : " +years);
		}
		else
		{
			System.out.println("It is not leap year : " +years);
		}
	}

}
