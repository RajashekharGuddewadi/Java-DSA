package Array;

public class insertingElements {
	
	static int insertend(int arr[],int n,int key,int capacity) {
		if(n >= capacity) {
			return n;
		}else {
			arr[n]=key ;
			return (n+1);
		}
	}
	

	public static void main(String[] args) {
		int arr[] = new int[20];
		arr[0]=6;
		arr[1]=12;
		arr[2]=14;
		arr[3]=5;
		arr[4]=20;
		arr[5]=25;
		
		int capacity =20;
		
		int n=6;
		int i,key= 30;
		
		
		System.out.println("Array before Insertion : ");
		for( i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		n=insertend(arr,n,key,capacity);
				
		System.out.println("\nArray after Insertion : ");
		for( i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		n=insertend(arr,n,key,capacity);
		
		System.out.println("\nArray after Insertion : ");
		for( i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
	}

}
