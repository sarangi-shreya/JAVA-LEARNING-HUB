import java.util.Scanner;

class Tax
{
	public static double Tax(int x)
	{
		double t;
		if (x <= 150000)
		{	
			t = 0;
		}
		else if(x <= 300000 )
		{
			t = (x - 150000) * 0.10;
		}
		else if (x <= 500000)
		{
			t = (150000 * 0.10) + (x - 300000) * 0.20;
		}
		else
		{
			t = (150000 * 0.10) + (200000 * 0.20) + (x-500000) * 0.30;
		}
		return t;
	}
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter income amount:");
		int x=sc.nextInt();
		double res = Tax(x);
		System.out.print("Tax to be paid is:Rs "+res);
	
	}
}
		
		
		
		
