class Pattern_101
{
	public static void main(String[] args) 
	{
		int p_height=5;
		int p_space=p_height-1;
		int i,j,k,n,x=1;
		for(i=1;i<=p_height;i++)
		{
			for(n=1;n<=p_height;n++)
			{
				System.out.print(" ");
			}
			for(k=p_space;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(i=0;i<p_height;i++)
		{
			for(j=p_space;j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			for(n=(p_height+p_height-2);n>=x;n--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			x+=2;
			System.out.println("");
		}
	}
}