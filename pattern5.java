package java_concepts;// Diamond pattern 

import java.util.Scanner;

public class pattern5 
{
public static void main(String[] args) 
	{
		int n=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n);
		}
		else
		{
			n=n+1;
			System.out.println(n);
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=(2*i)-1;k++)
				{
					System.out.print("*");
				}				
			System.out.println("");
		}
		num=n;
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=((num*2)/2)+1;k++)
				{
					if(num%2==0)
					{
					System.out.print("*");
					}
					else
					{
						num=num-1;
						System.out.print("*");
					}
				}
				num--;	
			System.out.println("");
		}
	}
}