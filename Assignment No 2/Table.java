import java.util.*;
class Table
{
public static void main(String args[])
{
	int i,a;
	System.out.print("Enter the number : ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for (i=1;i<=10;i++)
{
a=i*n;
System.out.println(+n+ "*" +i+"=" +a);
}
}
}