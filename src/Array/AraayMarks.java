package Array;

import java.util.Scanner;

public class AraayMarks {

	public static void main(String[] args) {
//		int marks[]= new int[3];
//		
//		marks[0]=97;
//		marks[1]=92;
//		marks[2]=95;
		Scanner sc = new Scanner(System.in);
		
		int size=sc.nextInt();
		
		int marks[]= new int[size];
		
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<size; i++) {
			System.out.println(marks[i]);
		}

	}

}
