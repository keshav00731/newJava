package java_concepts;
import java.util.Scanner;
public class patrn 
{
public static void main(String[] args)
	{
		int num,o=1,p=2;
		//Scanner sc =new Scanner(System.in);
		//System.out.print("Enter value of n:");
		//n=sc.nextInt();
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
					{	
				     num=2*o;
						System.out.print(num+ " ");
					o++;
					}
			System.out.println("");}
			for(int i=1;i<=2;i++)
			{
				for(int j=1;j<=p;j++){
					num=2*o;
					System.out.print(num+ " ");
				o++;
				
				}
				p--;
				System.out.println("");
			}
	}
}
