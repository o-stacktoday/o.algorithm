package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		char test = 'a';
		
		
		System.out.println(test);
		
		while(test != ch) {
			
			test = (char) (test + 1);
			System.out.println(test);
			
			if(test == ch) {
				return;
			}
		}
		
	}
}
