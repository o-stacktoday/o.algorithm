package basic5.codeup_basic100;

import java.util.Scanner;

public class basic1095 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int small = n;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
//			System.out.println("num : "+ num);
			if(small > num) {
				small = num;
			}
		}
		System.out.println(small);
		
//		실행중 에러남.
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] arr = new int[n+1];
//		
//		for (int i = 0; i < n; i++) {
//			int num = sc.nextInt(); 
//			arr[num] = arr[num]+1;
//		}
//		
//		for (int i = 1; i <= n; i++) {
//			if(arr[i] != 0) {
//				System.out.println(i);
//				return;
//			}
//		}
	}
}
