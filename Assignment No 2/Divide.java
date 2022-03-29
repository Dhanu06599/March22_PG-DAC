//Write a Java program to divide two numbers and print on the screen
import java.util.*;
class Divide
{
	public static void main (String[] args)
	{
		System.out.print("Enter two digit ");
		Scanner sc =new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x/y;
		System.out.print(z);
	}
	
}