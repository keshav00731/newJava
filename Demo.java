package java_concepts;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{	
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		a=sc.nextInt();
		System.out.print("Enter second number");
		b=sc.nextInt();
		c=a+b;
		
		System.out.print(c);
	}

}
