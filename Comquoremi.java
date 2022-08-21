import java.util.Scanner;

/**
 * 
 * @author srikanth naidu
 *in this programe we required Divisor,Dividend,Quotient and Reminder
 * 
 * Divisor)Dividend(Quotient
 *         ________
 *         Reminder
 *   
 *    Quotient = Dividend/Divisor
 *   
 *   Reminder=Dividend - (Divisor*Quotient)
 */
public class Comquoremi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//taken Divisor
		System.out.println("PLease Enter Divisor: ");
		int Divisor = in.nextInt();
		//take Dividend
		System.out.println("Please enter Divident: ");
		int Dividend = in.nextInt();
		int Quotient =  Dividend/Divisor;
		int Reminder = Dividend-(Divisor*Quotient);
		System.out.println("Quotient = "+Quotient);
		System.out.println("Reminder = "+Reminder);
		

	}

}
