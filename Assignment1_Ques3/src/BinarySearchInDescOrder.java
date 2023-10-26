import java.util.Scanner;

public class BinarySearchInDescOrder {

	public static int binarySearchDesc(int arr[], int key) {
		int left = 0, right = arr.length - 1; 
		
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(arr[mid] == key) 
				return mid;
			else {
				if(key < arr[mid]) 
					right = mid -1;
				else
					left = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
		
		System.out.print("Enter the key : ");
		int key = scan.nextInt();
		
		int result = binarySearchDesc(arr, key);
		if(result != -1)
			System.out.println("The element is at index : " + result);
		else
			System.out.println("Element not found!!");
		
		scan.close();
	}

}
