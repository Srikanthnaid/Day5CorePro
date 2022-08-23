/**
 *  @author srikanth naidu
 *  root find formula=[-b±√(b*2-4ac)]/2a;
 *  √(b*2-4ac)=Math.sqrt(D)
 *  	5x² – 2x – 6 = 0
 *  	A=5
 *  	B=-2
 *  	C=-6
 *  	D = B*B - 4*A*C;=124
 *  	Root=(-B +- Math.sqrt(D))/(2*A);
 */
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ä=:");
		int A = sc.nextInt();
		System.out.println("B=:");
		int B = sc.nextInt();
		System.out.println("C=:");
		int C = sc.nextInt();
		int Delta = B*B - 4*A*C;
		System.out.println(Delta);
		int Root1=(int) ((-B + Math.sqrt(Delta))/(2*A));
		System.out.println(Root1);
		int Root2=(int)(-B - Math.sqrt(Delta))/(2*A);
		System.out.println(""+Root2);
	}

}
