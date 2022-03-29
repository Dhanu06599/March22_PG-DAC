//Write a Java program that takes two numbers as input and display the product of two numbers.
import java.util.*;
class product
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number :");
		int a = sc.nextInt();
		System.out.print("Input second number :");
		int b = sc.nextInt();
		int c = a*b;
		System.out.println("The product of two number is :" +c);
	}
}