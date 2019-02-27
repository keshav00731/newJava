package java_concepts;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		int n=0,ttlRows;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter total rows:");
		  n=sc.nextInt();
		ttlRows=n;
		for(int i=1;i<=n+1;i++)
		{
			for(int j=1;j<=ttlRows;j++)
			{
				System.out.print(ttlRows);
			}
			ttlRows--;
			System.out.println(" ");
		}
	}
}
