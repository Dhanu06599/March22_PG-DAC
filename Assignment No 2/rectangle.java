//Write a Java program to print the area and perimeter of a rectangle.
/*Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/
import java.util.*;
class rectangle
{
	public static void main (String[] args)
	{
		double w, H;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter width :");
		w = sc.nextDouble();
		System.out.print("Enter Height :");
		H= sc.nextDouble();
		double area = w*H;
		double per = (2*(w+H));
		System.out.println("area is = " +area);
		System.out.print("perimeter is =" +per);
	}
}