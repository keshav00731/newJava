package java_concepts;

import java.util.Scanner;

public class patetrn4 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("prin n:");
		n=sc.nextInt();
		/*for(int i=5;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println(" ");
		}
		int ttlRows=5,numPrint=5;
		for(int i=0;i<=ttlRows;i++)
		{
			for(int j=1;j<=ttlRows-i;j++)
			{
				System.out.print(numPrint);
				
			}
			numPrint--;
			System.out.println(" ");*/
		for(int a=n;a>0;a--){
			for(int b=1;b<n-a;b++){
				System.out.print(" ");
			}
			for(int k=1;k<a;k++)
			{
				//if((a+b)%2==0){
				System.out.print("* ");
				//}		
				}
			System.out.println(" ");
		}}
		}
	

