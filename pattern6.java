package java_concepts;//right angle triangle

public class pattern6 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=(5+1)-i;k++)//n--
				{
					System.out.print("*");
				}
				System.out.println("");
		}

	}
}
