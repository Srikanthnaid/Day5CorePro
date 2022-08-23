/**
 *  @author srikanth naidu
 *  distance formula =sqrt(x*x + y*y).
 *  by using poewr function
 *  distance formula =  Math.pow((x*x + y*y),0.5);
 */
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X_values on X-axis :");
		int x =sc.nextInt();
		System.out.println("Enter the Y_values on the Y_axis");
		int y=sc.nextInt();
		int dis = (int) Math.pow((x*x + y*y),0.5);
		System.out.println("Distance :"+dis);
	}

}
