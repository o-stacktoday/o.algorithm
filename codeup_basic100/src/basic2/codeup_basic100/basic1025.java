package basic2.codeup_basic100;

import java.util.Scanner;

public class basic1025 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] test = sc.next().split("");
		int a,b,c,d,e;
		a = Integer.parseInt(test[0]);
		b = Integer.parseInt(test[1]);
		c = Integer.parseInt(test[2]);
		d = Integer.parseInt(test[3]);
		e = Integer.parseInt(test[4]);
		System.out.println("["+a*10000+"]");
		System.out.println("["+b*1000+"]");
		System.out.println("["+c*100+"]");
		System.out.println("["+d*10+"]");
		System.out.println("["+e+"]");
		
		
		
	}

}
