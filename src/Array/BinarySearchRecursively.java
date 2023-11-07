package Array;

public class BinarySearchRecursively {
	
	
	static int BinarySearch(int arr[],int l,int r,int key) {
		
		if(r>=l) {
			int mid = l+(r-1)/2;
			
			if(arr[mid]==key)
				return mid;
			
			if(arr[mid]>key)
				return BinarySearch(arr,l,mid-1,key);
			
			return BinarySearch(arr,mid+1,r,key);
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[]= {25,50,75,100,125,150};
		int key=50;
        int result = BinarySearch(arr,0,arr.length-1,key);
		
		if(result == -1) {
			System.out.println("element not found");
		}else {
			System.out.println("element foud at index at :- " + result);
		}

	}

}
