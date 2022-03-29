//Write a Java program to print the area and perimeter of a circle.
import java.util.*;
class circle
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter radius :"); //7.5
		double r = sc.nextDouble();
		double perimeter = ( 2*(22.0/7)*r);
		double area = (22.0/7)*r*r;
		System.out.println("perimeter of circle is = " + perimeter); //47.14285714285714
		System.out.print("Area of circle is =" +area); //176.78571428571428
	}
}