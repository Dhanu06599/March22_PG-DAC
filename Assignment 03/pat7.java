class pat7
{
	public static void main (String[] args)
	{
		int i, j,k,m,a,b,c,d,x=3;
		for (i=1;i<=5;i++)
		{
				for (k=4;k>=i;k--)
				{
					System.out.print(" ");
				}
			for (j=1;j<=i;j++)
			{
				System.out.print("*");
			}
				for (m=i-1;m>=1;m--)
				{
					System.out.print("*");
				}
			System.out.println();
		}
		for (a=1;a<=4;a++)
		{
			for (b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			for (c=a;c<=4;c++)
			{
				System.out.print("*");
			}
			for (d=1;d<=x;d++)
			{
				System.out.print("*");
			}
			x--;
		System.out.println();
		}
		
	}
}