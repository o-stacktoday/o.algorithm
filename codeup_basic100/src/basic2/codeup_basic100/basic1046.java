package basic2.codeup_basic100;

import java.util.Scanner;

public class basic1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1+num2+num3;
		float avg = (float)sum/3;
		System.out.println(sum);
		System.out.println(String.format("%.1f", avg));
		
		
	}

}
