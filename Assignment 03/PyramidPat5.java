class PyramidPat5
{
public static void main(String[] args)
{
int i,j,k,a;
for(i=9;i>=1;i--)
{
  for(k=1;k<=i-1;k++)
   {
	 System.out.print(" ");
   }
  for(j=i;j<=9;j++)
   {
    System.out.print(j);
	}
	for(a=8;a>=i;a--)
	{
		System.out.print(a);
	}
System.out.println();
}
}
}