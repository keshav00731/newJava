package java_concepts;

import java.util.Scanner;
public class pattern8 
{
	public static void main(String[] args) 
	{
		int n=0,num=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n:");
		n=sc.nextInt();
		num=n;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i-1;j++)
				{
					System.out.print(" ");
				}
					for(int k=1;k<=(num*2)-1;k++)
					{
						System.out.print("*");
						
					}
					System.out.println("");
					num--;
			}
		}

	}

