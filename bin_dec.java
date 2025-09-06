import java.util.Scanner;

class bin_dec {
	
	public static void convert(int n)
	{
		int[] binary = new int[50]; //Creating an Array
        	int j,x,i = 0;
		x = n;
		while (n > 0)
 		{
            		binary[i] = n % 2;
            		n = n / 2;
            		i++;
     		}
        	System.out.print("Binary equivalent of " + x + " is: ");
        	for (j = i - 1; j >= 0; j--) {
            		System.out.print(binary[j]);
        	}
    	}
    	public static void main(String s[]) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a decimal number: ");
        	int n = sc.nextInt();
        	convert(n);
       
	}
}

