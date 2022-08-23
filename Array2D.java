/**
 * 
 * @author srikanth naidu
 *
 *2D Array means
 *		2*2 matrix
 *		|a1 b1|
 *		|a2 b2|
 *		m=rows $$ n=cols
 */
import java.util.Scanner;
public class Array2D
{

	public static void main(String args[]) {
	     int a[][]=new int[2][2];
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter array elements:");
	     for (int rows=0;rows<2;rows++) //rows
	     {
	    	 for(int cols=0;cols<2;cols++) //columns
	    	 {
	    		 a[rows][cols]=sc.nextInt();
	    	 }
	   }
	     System.out.println("Matrix : \n");
	     for (int rows=0;rows<2;rows++)//rows
	     {
	    	 for(int cols=0;cols<2;cols++)//columns
	    	 {
	    		 System.out.print(a[rows][cols] +"");
	    	 }
	    	 System.out.println();
	     }
	 }
}
