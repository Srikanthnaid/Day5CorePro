/**
 * @author srikanth naidu
 * arr[4] =|_5|_4|_-2|_-3|
 *       enter elements
 *       5,4,-2,-3
 *       /\
 *      /  \
 *     -2   4
 *     /
 *    -3  
 */		
import java.util.Scanner;

public class SumOfThree
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the lenth of array :");
int Length = sc.nextInt();

int[] arr = new int[Length];
System.out.println("Enter the integers :");

for (int i = 0; i < Length; i++) {
arr[i] = sc.nextInt();
}

int distinctCount = 0;

for (int i = 0; i < Length; i++)
for (int j = i + 1; j < Length; j++)
for (int k = j + 1; k < Length; k++)

if ((arr[i] + arr[j] + arr[k]) == 0) {

distinctCount++;
System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");

}

System.out.println("Total distinct triples : " + distinctCount);
}
}

