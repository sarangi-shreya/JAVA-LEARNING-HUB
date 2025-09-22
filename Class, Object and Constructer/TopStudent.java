/*Define a class Student having the attribute regNo,  stdName,  branch and CGPA. Write 2 methods to accept and display the student details.  
Read the details of 50 students using an array of Student class object. Display the student details who has secured the highest CGPA.*/

import java.util.Scanner;
class Student {
    String sic;
    String name;
    String branch;
    double cgpa;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter SIC: ");
        sic = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = sc.nextDouble();
    }
    void putData() {
        System.out.println("SIC    : " + sic);
        System.out.println("Name   : " + name);
        System.out.println("Branch : " + branch);
        System.out.println("CGPA   : " + cgpa);
    }
}
class TopStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details of Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getData();
        }
        int topIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (students[i].cgpa > students[topIndex].cgpa) {
                topIndex = i;
            }
        }
        System.out.println("/--- Student with Highest CGPA ---/");
        students[topIndex].putData();
    }
}
