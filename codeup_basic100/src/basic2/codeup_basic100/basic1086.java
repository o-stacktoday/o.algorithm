package basic2.codeup_basic100;

import java.util.Scanner;

public class basic1086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long w = sc.nextInt();
		long h = sc.nextInt();
		long b = sc.nextInt();
		
		long num = (w*h*b)/8;
		float mb = (float)num/1024/1024;
		System.out.println(String.format("%.2f",mb)+" MB");
		
		
	}

}
