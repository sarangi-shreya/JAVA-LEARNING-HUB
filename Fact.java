import java.util.Scanner;

class fact {
	public static int fact(int x) {
		int i,fact=1;
		for(i=1;i<=x;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String s[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive no:");
		int x=sc.nextInt();
		int res = fact(x);
		System.out.print("Factorial is:"+res);
	}
}
		
		
		
		