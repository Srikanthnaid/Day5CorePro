/**N is taken from the user
 * H1=1
 * h2=h1+1/2
 * .....
 * .......
 * ........
 * h(n)=h(n-1) + 1/n -->check i=n here
 * 
 */
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		 System.out.println("Enter N value : ");
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 double result = 0.0;
		 for (int i=n;i>0;i--)
		 {
			  result = result+(double)1/i;
			  System.out.println(""+result);
		 }
	}

}
