import java.util.Scanner;

/**
 * prime factorization is a find method
 * 
 * @author srikanth naidu
 * n is taken from user i.e which number you want find prime factorization
 * 2|_50
 * 5|_25
 * 5|_5
 * 1
 * 2*5*5*1 this are the prime factors of 50
 */
public class PrimeFact {

	public static void main(String[] args) {
		System.out.println("Please enter the PrimeFactorization number : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 2;i<n;i+=1)
		{
			while(n%i==0)
			{
				n=n/i;
				System.out.println(i);
			}
		}
		if(n >2) {
	         System.out.println(n);
	      }
		
	}

}
