package java_concepts;//1,23,465,78910
import java.util.Scanner;
public class pattern2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value of loop:");
		int n=sc.nextInt(),num=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(num);
				++num;
			}
			System.out.println(" ");
		}
	}

}
