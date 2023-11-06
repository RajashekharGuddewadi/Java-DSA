package Array;

public class Arraydemo {

	public static void main(String[] args) {
		int array[];
		
		array = new int[8];
		System.out.println("Array before adding data ");
		dispaly(array);
	
	
	for(int i=0;i<array.length;i++) {
		System.out.println("Adding "+ i+" at index "+i);
		array[i]=i;
	}
	System.out.println();
	System.out.println("Array after adding data");
	dispaly(array);
	
//	int index=5;
//	array[index]=10;
	int index=6;
	array[index]=15;
	System.out.println("Array after updating at index "+index);
	dispaly(array);
	
	search(array, index);
	}
	private static void search(int[] array, int index) {
		for(int i = 0; i< array.length; i++)
	      {
			int value=15;
	         if(array[i] == value ){
	            System.out.println(value + " Found at index "+i);
	            break;
	         }
	      }         
	      
		
	}
	private static void dispaly(int[] array) {
		System.out.print("Array : [");
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println(" ]");
		System.out.println();
		
	}

}
