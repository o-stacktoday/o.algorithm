package basic2.codeup_basic100;

import java.util.Scanner;

public class basic1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long s = sc.nextInt();
		
		long num = (h*b*c*s)/8;
		float mb = (float)num/1024/1024;
		System.out.println(String.format("%.1f",mb)+" MB");
		
		
	}

}
//48000 32 5 300
//274.7 MB
