class Pattern_70
{
	public static void main(String[] args) 
	{
		int p_height=5;
		for(int i=p_height;i>0;i--)
		{
			for(int k=p_height-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
	}
}