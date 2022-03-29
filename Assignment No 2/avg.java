//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.*;
class avg 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in); 
		System.out.print("Enter the three number for avg : ");
		double x = sc.nextDouble();
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y = ((x+x1+x2)/3);
		System.out.print("Average of three number is :" +y);
	}
}