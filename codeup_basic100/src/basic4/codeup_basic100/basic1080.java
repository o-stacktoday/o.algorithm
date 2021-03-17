package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int sum = 0;
		int i = 1;
		int ans = 0;
		
		for(i = 1; sum <= num; i++) {
			sum = sum+i;
//			System.out.println("sum : "+sum);
			if(sum >= num) {
				ans = i;
				System.out.println(ans);
				return;
			}
			
		}
		
//		System.out.println("ans : "+ans);
		
		
	}
}
