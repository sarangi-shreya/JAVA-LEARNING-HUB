import java.util.Scanner;

class Add_matrix {
	
	public static void add(int arr1[][],int arr2[][],int arr3[][],int r,int c)
	{
		int sum=0;
		if(r!=c)
			System.out.print("Enter a square matrix for addition!");
		else
		{
			for (int i = 0; i < r; i++)
 			{
     			 	for (int j = 0; j < c; j++)
				{
					arr3[i][j] = arr1[i][j]+arr2[i][j];
             			
                		}
    			}
			System.out.println("Addition is:");
			for(int i = 0; i < r; i++)
			{
				for(int j = 0; j < c; j++)
				{
					System.out.print(arr3[i][j]+" ");
				}
				System.out.println();	
			}
			
		}
	}
    	public static void main(String s[]) {
		int[][] arr1 = new int[50][50];
		int[][] arr2 = new int[50][50];
		int[][] arr3 = new int[50][50];
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter no of row and column of matrices: ");
        	int r = sc.nextInt();
		int c = sc.nextInt();
		System.out.print("Enter elements of matrix 1: ");
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter elements of matrix 2: ");
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
        	add(arr1,arr2,arr3,r,c);
	}
}

