import java.util.Scanner;
class Jagged_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        int[][] a = new int[r][];
        for (int i = 0; i < r; i++) {
            System.out.print("Enter number of columns in row " + (i + 1) + ": ");
            int c = sc.nextInt();
            a[i] = new int[c];
            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nThe jagged array is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a[i].length; j++) 
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
