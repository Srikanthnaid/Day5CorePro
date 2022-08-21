/***
 *  @author srikanth naidu
 * first a= 20
 *       b=30
 *       after swap
 *       i.e a value goes to b|b value goes to a
 *       temp=a;
 *       a=b;
 *       b=temp;
 */
import java.util.Scanner;

public class Swap2num 
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please eneter first number:");
		int a=in.nextInt();
		System.out.println("please enter second number:");
		int b=in.nextInt();
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.err.println("a"+a);
		System.out.println("b"+b);
	}
}
