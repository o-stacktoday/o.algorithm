package basic5.codeup_basic100;

import java.util.Scanner;

public class basic1094 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int num = 0;
		
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			arr[i] = num;
		}

		for(int i = n-1; i>=0; i-- ) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
}
