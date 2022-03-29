//Write a Java program to convert a binary number to decimal number
import java.util.*;
class bindec
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a;
double b=0;
int i=0;

System.out.print("Enter the number : ");
{
long n=sc.nextLong();
while(n>0)
{
a=(n%10)*Math.pow(2,i);
b=b+a;
i++;
n=n/10;
}
System.out.print(" Decimal number is : "+b);
}
}
}

