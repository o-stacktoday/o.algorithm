package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			char ch = sc.next().charAt(0);
			System.out.println(ch);
			if(ch == 'q') {
				return;
			}
		}
		
	}
}
