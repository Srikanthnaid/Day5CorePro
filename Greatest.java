/**
 * @author srikanth naidu
 * a>b && a>c
 * b>a && b>c
 * a==b || a==c
 */
import java.util.Scanner;

import javax.swing.DefaultListSelectionModel;

public class Greatest {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Please Enter 1st number :");
		int a=in.nextInt();
		System.out.println("Please enter a 2nd number: ");
		int b = in.nextInt();
		System.out.println("Please enter a 3rd number: ");
		int c = in.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater :"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater :"+b);
		}
		else if(a==b || a==c)
		{
			System.out.println("all numbers are same");
		}
		else 
		{
			System.out.println("C is greater: "+c);
		}

	}

}
