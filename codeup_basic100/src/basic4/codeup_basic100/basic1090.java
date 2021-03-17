package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int r = sc.nextInt(); // 등비값
		int n = sc.nextInt();
		long sum = a;
		
		for(int i = 1; i<=n; i++) {
			
			if(i == n) {
				System.out.println(sum);
			}
			sum = sum*r;
		}
		
	}
}
