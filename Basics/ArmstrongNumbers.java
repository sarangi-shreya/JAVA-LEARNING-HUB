import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String s[])
 {
        System.out.println("Armstrong numbers from 1 to 10000 are:");
	for (int num = 1; num <= 10000; num++) 
         {
            int original = num;
            int sum = 0;
            int digits = 0, temp1 = num;

        while (temp1 > 0)
            {
                digits++;
                temp1 /= 10;
            }
            int temp2 = num;
            while (temp2 > 0) {
                int digit = temp2 % 10;
                sum += Math.pow(digit, digits);
                temp2 /= 10;
            }
            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}
