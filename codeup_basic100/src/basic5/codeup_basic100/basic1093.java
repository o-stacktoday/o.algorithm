package basic5.codeup_basic100;

import java.util.Scanner;

public class basic1093 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[24];
		
		for(int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			arr[num] = arr[num]+1;
		}

		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
