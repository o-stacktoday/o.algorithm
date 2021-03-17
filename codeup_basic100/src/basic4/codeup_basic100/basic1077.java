package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1077 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			System.out.println(i);
			if(i == num) {
				return;
			}
		}
	}
}
