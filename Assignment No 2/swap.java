//Write a Java program to swap two variables.
import java.util.*;
class swap
{
	public static void main (String [] args)
	{
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the value of X : ");
		int x = sc.nextInt();
		System.out.print(" Enter the value of y : ");
		int y = sc.nextInt();
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swap the value of X is : "+x);
		System.out.println("After swap the value of X is : "+y);
		
		}
}