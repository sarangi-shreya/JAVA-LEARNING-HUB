import java.util.Scanner;

class quadratic {
	public static void quadratic(double a,double b,double c) {
	 	double d,r1,r2;
		d = (b*b)-(4*a*c);
		if (d < 0)
		{	
			System.out.println("Complex roots!");
		}
		else if(d > 0 )
		{
			System.out.println("Two real and distinct roots!");
		}
		else if (d == 0)
		{
			System.out.println("One real root!");
		}
		r1 = (-b + Math.sqrt(d))/(2*a);
		r2 = (-b + Math.sqrt(d))/(2*a);
		System.out.print("Roots are:"+r1+" and" +r2);
	}
	public static void main(String s[]) {
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter coefficients:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		quadratic(a,b,c);
	}
}
		
		
		
		