import java.util.Scanner;

public class Grade 
{
	public static char cal(double avg) 
	{
        	if (avg >= 90)
            		return 'O';
        	else if (avg >= 80)
            		return 'E';
        	else if (avg >= 70)
            		return 'A';
        	else if (avg >= 60)
            		return 'B';
        	else if (avg >= 50)
            		return 'C';
        	else
            		return 'F';
    	}

    	public static void main(String s[]) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter marks of Subject 1: ");
        	int s1 = sc.nextInt();
        	System.out.print("Enter marks of Subject 2: ");
        	int s2 = sc.nextInt();
        	System.out.print("Enter marks of Subject 3: ");
        	int s3 = sc.nextInt();
        	System.out.print("Enter marks of Subject 4: ");
        	int s4 = sc.nextInt();
		double avg = (s1 + s2 + s3 + s4) / 4.0;
		char grade = cal(avg);
		System.out.println("Average Marks: " + avg);
        	System.out.println("Grade: " + grade);
	}
}
