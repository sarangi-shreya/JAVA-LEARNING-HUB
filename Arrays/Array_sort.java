import java.util.Scanner;

class Array_sort {
	
	public static void sort(int arr[],int arraySize)
	{
		for (int i = 0; i < arraySize-1; i++)
 		{
     			 for (int j = 0; j < arraySize - i - 1; j++)
			{
                		if (arr[j] > arr[j + 1]) {
                   		 	int temp = arr[j];
                    			arr[j] = arr[j + 1];
                    			arr[j + 1] = temp;
                		}
     			}
    		}
	}
    	public static void main(String s[]) {
		int[] arr = new int[50];
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter size of array: ");
        	int arraySize = sc.nextInt();
		System.out.print("Enter elements of array: ");
		for(int i = 0; i < arraySize; i++)
		{	
			arr[i] = sc.nextInt();
		}
        	sort(arr,arraySize);
		System.out.println("Array after sorting is:");
		for(int i = 0; i < arraySize; i++)
		{	
			System.out.print(+arr[i]+" ");
		}
	}
}

