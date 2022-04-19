class p9
{
public static void main(String args[])
{
char i,j,k,ab=1;
for(i='A';i<='E';i++)
{
  for(k=4;k>=ab;k--)
  {
  System.out.print(" ");
  ab++;
  }
  for(j='A';j<=i;j++)
   {
    System.out.print(j+" ");
}

System.out.println();
}}}