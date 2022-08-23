import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the WindTemperature in Fahrenheit: ");
		double Temperature =sc.nextDouble();
		System.out.println("Enter the Wind_Speed in miles per hour: ");
		double Speed=sc.nextDouble();
		double WindChild = 35.71+0.6215*Temperature +(0.4275*Temperature -35.75)*Speed*0.16;
		System.out.println(WindChild);
	}

}
