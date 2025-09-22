/*Design a class ‘Time’ having data members as hour, minute and second. The class should have a parameterized constructor to initialize its data members. 
It should also have methods displayTime() to display the time in HH:MM:SS format and addTime() to add two times. 
Test these methods by creating a main method in another class.*/

import java.util.Scanner;
class Time {
    int hrs;
    int mins;
    int secs;
    Time(int hrs, int mins, int secs) {
        this.hrs = hrs;
        this.mins = mins;
        this.secs = secs;
    }
    void displayTime() {
        System.out.printf("%02d:%02d:%02d", hrs, mins, secs);
    }
    Time add(Time t) {
        int newSecond = this.secs + t.secs;
        int newMinute = this.mins + t.mins + newSecond / 60;
        int newHour = this.hrs + t.hrs + newMinute / 60;
        newSecond = newSecond % 60;
        newMinute = newMinute % 60;
        newHour = newHour % 24;  
        return new Time(newHour, newMinute, newSecond);
    }
}
class TimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first time:");
        System.out.print("Hour: ");
        int h1 = sc.nextInt();
        System.out.print("Minute: ");
        int m1 = sc.nextInt();
        System.out.print("Second: ");
        int s1 = sc.nextInt();
        System.out.println("\nEnter second time:");
        System.out.print("Hour: ");
        int h2 = sc.nextInt();
        System.out.print("Minute: ");
        int m2 = sc.nextInt();
        System.out.print("Second: ");
        int s2 = sc.nextInt();
        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);
        System.out.print("\nFirst Time : ");
        t1.displayTime();
        System.out.print("\nSecond Time: ");
        t2.displayTime();
        Time sum = t1.add(t2);
        System.out.print("\nSum of Times: ");
        sum.displayTime();
    }
}
