import java.util.Scanner;

class Array_search {
	
	public static void convert(int arr[],int arraySize,int x)
	{
    int i;
		for (i = 0; i < arraySize; i++)
 		{
      if(arr[i] == x)
			{
			  System.out.println("Element is present at index "+i);
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
	System.out.print("Enter element to search: ");
	int x = sc.nextInt();
    convert(arr,arraySize,x);   
	}
}

