package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 시작값
		int d = sc.nextInt(); // 등차값
		int n = sc.nextInt(); // 몇번째수인지
		int sum = a;
		
		for(int i = 0; i <= n; i++) {
			
			if(i == n-1) {
				System.out.println(sum);
			}
			sum = sum + d;
			
			
		}
		
		
		
	}

}
