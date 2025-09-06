import java.util.Scanner;

class Days {
	public static void main(String s[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no from 1 to 7:");
		int x = sc.nextInt();
		switch(x) {
			case 1: System.out.print("Monday!");
				break;
			case 2:System.out.print("Tuesday!");
				break;
			case 3:System.out.print("Wednesday!");
				break;
			case 4:System.out.print("Thursday!");
				break;
			case 5:System.out.print("Friday!");
				break;
			case 6:System.out.print("Saturday!");
				break;
			case 7:System.out.print("Sunday!");
				break;
			default:System.out.print("Enter a valid choice!!");
				break;
		}
	}
}

		
		
		
		