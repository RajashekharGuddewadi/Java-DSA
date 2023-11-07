package Array;

import java.util.Scanner;

public class SearchNumberInArray {

	public static void main(String[] args) {
		int numbers[] = {10,25,87,10,35,80};
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==x) {
				System.out.println(i);
			}
		}
			

	}

}
