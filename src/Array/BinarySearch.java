package Array;

import java.util.Scanner;

public class BinarySearch {
	
	
	static int BinarySearch(int arr[],int key) {
		int l=0,r=arr.length-1;
		
		while(l<=r) {
			int m = l+(r-1)/2;
			
			if(arr[m]==key) {
				return m;
			}
			
			if(arr[m] <key)
				l =m+1;
			
			else
				r=m-1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: -");
		int size = sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the array element : -");
		for(int i=0;i<size;i++) {
			 arr[i]=sc.nextInt();
;		}
		System.out.println("enter the search element : -");
		int key=sc.nextInt();
		
		int result = BinarySearch(arr,key);
		
		if(result == -1) {
			System.out.println("element not found");
		}else {
			System.out.println("element foud at index at :- " + result);
		}
	}

}
