class PyramidPat6
{
public static void main(String[] args)
{
int i,j,k, a=9;
for(i=1;i<=9;i++)
{
 for(k=1;k<=i;k++)
 {
 System.out.print(" ");
 }
  for(j=i;j<=9;j++)
   {
    System.out.print(" " );
	System.out.print("*");
}
a--;
System.out.println();
}
}
}