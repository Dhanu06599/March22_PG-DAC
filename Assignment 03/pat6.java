class pat6
{
	public static void main (String[] args)
	{
		int i, j,k,m;
		int a=4;
		for (i=1;i<=5;i++)
		{
				for (k=1;k<=i;k++)
				{
					System.out.print(" ");
				}
			for (j=i;j<=5;j++)
			{
				System.out.print("*");
			}
				for (m=1;m<=a;m++)
				{
					System.out.print("*");
				}
				a--;
			System.out.println();
		}
	}
}