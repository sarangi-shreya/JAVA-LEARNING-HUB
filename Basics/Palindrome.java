import java.util.Scanner;

class Palindrome {
	public static int palin(int x) {
		int d,rev=0;
		while(x>0)
		{
			d = x%10;
			rev = (rev*10)+d;
			x = x/10;			
		}
		return rev;
	}
	public static void main(String s[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no:");
		int x=sc.nextInt();
		int temp = x;
		int res = palin(x);
		if(temp == res)
		{
			System.out.print("Yes,it is a palindrome!");
		}
		else
		{
			System.out.print("No, it is not a palindrome!");
		}
	}
}
		
		
		
		