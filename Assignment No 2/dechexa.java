//Write a Java program to convert a decimal number to hexadecimal number.
import java.util.*;
class hexa
{
public static void main(String args[])
{
char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner sc=new Scanner(System.in);

int b=0;
String h=" ";

System.out.print("Enter the number : ");
int c=sc.nextInt();
while(c>0)
{
b=c%16;
h=a[b]+h;
c=c/16;
}
System.out.print("Hexadecimal number is : "+h);
}
}