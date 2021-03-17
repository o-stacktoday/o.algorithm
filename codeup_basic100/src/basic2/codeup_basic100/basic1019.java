package basic2.codeup_basic100;

import java.util.Scanner;

public class basic1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] test = sc.nextLine().split("\\.");
		int y , m, d ;
		y = Integer.parseInt(test[0]);
		m = Integer.parseInt(test[1]);
		d = Integer.parseInt(test[2]);
		
		String a, b, c;
		a = String.format("%04d",y);
		b = String.format("%02d",m);
		c = String.format("%02d",d);
		
		System.out.println(a+"."+b+"."+c);
	

	}
}
