package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
//			System.out.println(i);
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
	}
}


