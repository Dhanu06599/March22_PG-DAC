class p13
{
	public static void main (String[] args)
	{
		char i,j,k;
		int a=1;
		for (i='A';i<='E';i++)
		{
			for(k=4;k>=a;k--)
			{
				System.out.print(" ");
			a++;
			}
			for (j='A';j<=i;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}