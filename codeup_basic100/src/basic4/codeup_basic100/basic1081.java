package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= m; j++) {
				System.out.println(i+" "+j);
			}
		}
		
	}

}
