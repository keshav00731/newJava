package java_concepts;
import java.util.*;
public class pattern_Dainmond 
{
	public static void main(String[] args) 
	{
		int n=0,space=0,star=0,etc=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter value of n:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i<=((n+1)/2))
			{
				space=((n+1)/2)-i;//2
				star=((2*i)-1);	//1
			}
			else
			{
				space=i-((n+1)/2);
				star=star-2;
			}
				for(int j=1;j<=space;j++)
					{
						System.out.print("- ");
						
					}
				for(int k=1;k<=star;k++)
					{
						System.out.print("* ");
					}
				System.out.println(" ");
		}
	}
}
