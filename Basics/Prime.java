import java.util.Scanner;

class Prime
{
	public static void calculate(int x)
	{
		int i,count=0;
		if(x <= 1)
		{
			System.out.print("Number is not prime!");
		}
		else
		{
		
			for(i = 1; i <= x; i++)
			{	
				if (x % i == 0)
					count++;
			}
			if(count > 2)
				System.out.print("It is not a prime number!");
			else
				System.out.print("It is a prime number!");

		}
	}
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no:");
		int x=sc.nextInt();
		calculate(x);
	}
}
		
		
		
		