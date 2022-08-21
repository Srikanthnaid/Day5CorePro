/**
 *  @author srikanth naidu
 *  Vowels = A,E,I,O,u
 *  Consonants = Alphabets-Vowels.
 *  so we remember only vowels to identify consonants
 *  we check char if (V ='a'|| V='e' || V='i'|| V='u')
 *                else
 *                 remaining are all consonants; 
 */
import java.util.Scanner;

public class AlphaVowelCons {

	public static void main(String[] args) {
		char ch;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter Alphabet:");
		 ch = in.next().charAt(0);
		if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowel: " );
		}
		else
		{
			System.out.println("consonants : ");
		}

	}

}
