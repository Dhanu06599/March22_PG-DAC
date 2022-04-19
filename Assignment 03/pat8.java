class pat8
{
	public static void main (String[] args)
	{
		int i, j,a,b,k;
		for (i=1;i<=5;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (a=1;a<=5;a++)
		{
			for (k=5;k>=a;k--)
			{
				System.out.print("*"); 
			}
		{
			for (b=1;b<=a;b++)
			{
				System.out.print("");
			}
			System.out.println();
		}
		}
	}
}