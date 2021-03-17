package basic2.codeup_basic100;

import java.util.Scanner;

public class basic1027 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] test = sc.next().split("\\.");
		System.out.println(test[2]+"-"+test[1]+"-"+test[0]);
	}
}
