package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			
			sum = sum + i;
			
			if(sum >= num) {
				System.out.println(sum);
				return;
			}
		}
		
	}
}
