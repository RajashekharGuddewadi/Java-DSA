package Array;

public class linearSeartch {
	
	public static int search(int arr[],int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) 
				return i;
			}
			return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {50,25,30,65,85,55,10};
		int x=50;
		
		int result = search(arr,x);
		if(result==-1) {
			System.out.println("not found");
		}else {
			System.out.println("element is found at index :- "+result);
		}
		
		

	}

}
