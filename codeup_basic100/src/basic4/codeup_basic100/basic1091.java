package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //시작값
		int m = sc.nextInt(); //곱할값
		int d = sc.nextInt(); //더할값
		int n = sc.nextInt(); //몇번째인지
		long sum = a;
		
		for(int i = 1; i <= n; i++) {
			if(i == n) {
				System.out.println(sum);
			}
			sum = sum * m + d;
		}
		
		
	}

}
