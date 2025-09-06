import java.util.Scanner;
class GCD{
	public static int calculate(int a,int b) {
		int res = (a < b) ? a:b;
		while(res > 0)
		{
			if (a % res == 0 && b % res == 0)
				break;
        }
        res--;
		return res;
    }
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int a,b,res;
		System.out.print("Enter two no:");
		a = sc.nextInt();
		b = sc.nextInt();
		res = calculate(a,b);
		System.out.print("GCD is:"+res);
	}
}	
		