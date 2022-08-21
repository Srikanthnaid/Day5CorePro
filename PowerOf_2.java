/**
 * @author srikanth naidu
 * 2*i=>n check
 */
import java.util.Scanner;

public class PowerOf_2 {

	public static void main(String[] args) 
	{
		int n = 10,result = 1;
		System.out.println("Enter no:");
		Scanner sc = new Scanner(System.in);
		 n=sc.nextInt();
		 for(int i=1;i<=n;i++)
		 {
			 result = 2 * i;
			 System.out.println("power" +result);
		 }
		 
	}

}
