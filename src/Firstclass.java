import java.util.*;
public class Firstclass{
	public static void main(String args[])
	{
		/*Scanner sc1=new Scanner(System.in);
		int n= sc1.nextInt();
		//int sum=2;
		
		int sum=0;
		for(int j=0;j<=n;j++)
		{
			sum=2*j;
			System.out.println(sum);
		}
		 //Prime numbers
		for(int i=1;i<=10;i++)
		{
			if (i%2!=0)
				System.out.println(i);
				
		}*/
		
		//Patterns
		System.out.println("Hollow Rectangle");
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i==0 || j==0 || i==4 || j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("Half Pyramid");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Inverted Half Pyramid");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j>=i)
					System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println("Inverted Half Pyramid 180 deg");
		int n=4;
		for(int i=1;i<=n;i++)
		{
			//Print spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//Print stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Inverted Half Pyramid with numbers");
		int m=5;
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=m-i+1;j++)
			{
					System.out.print(j);
			}
			System.out.println(" ");
		}
		System.out.println("Floyd's Pyramid with numbers");
		int num=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		System.out.println("0-1 Pyramid with numbers");
		//int number=1;
		int k=5;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)//Even
					System.out.print("1");
				else//ODD
					System.out.print("0");
			}
			System.out.println();
		}
		
		System.out.println("Solid Rhombus");
		//int number=1;
		int r=5;
		int c=9;
		for(int i=1;i<=r;i++)
		{
			//Spaces
			for(int j=1;j<=r-i;j++)
			{
					System.out.print(" ");
			}
			for(int j=1;j<=r;j++)
			{
					System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Butterfly Pattern");
		int l=4;
		for(int i=1;i<=l;i++)
		{
			//Stars for 1st part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			
				//2nd part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=l;i>=1;i--)
		{
			//Stars for 1st part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			
				//2nd part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Number Pyramid");
		int row=5;
		int number=1;
		for(int i=1;i<=row;i++)
		{
			//Spaces
			for(int j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			//Stars
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("Inverted Half Pyramid");
		for(int i=1;i<=5;i++)
		{
			//Spaces
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			//1st half
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			//2nd half
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
		
		System.out.println("Print pascal's traingle");
		
		for(int i=1;i<=5;i++)
		{
			int o=1;
			for(int j=1;j<=i;j++)
			{
				if(j==1)
					System.out.print(o);
				else
					System.out.print(j);
			}
			System.out.println();
		}
		
		
		}
	}
		
	

