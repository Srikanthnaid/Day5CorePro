import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) 
	{
		int Heads = 0;
		int Tails = 0;
		int TotalCount = 1;
		double random = 0.0;
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the number of flips :");
		int flips=s.nextInt();
		while(TotalCount<=flips)
		{
			random=Math.random();
			System.out.println("TotalCount :" +TotalCount+ "flips :" );
			
			if (random<0.5)
			{
				Heads++;
				System.out.println("Heads");
			}
			else
			{
				Tails++;
				System.out.println("Tails");
			}
			TotalCount++;
		}
		
		System.out.println("total number of heads occures : " +Heads);
		System.out.println("total number of tails occures : " +Tails);
		
		double headpercentage=(double)Heads/flips*100;
		double tailpercentage=(double)Tails/flips*100;
		
		System.out.println("percentage of head : " +headpercentage);
		System.out.println("percentage of head : " +tailpercentage);
	}

}
