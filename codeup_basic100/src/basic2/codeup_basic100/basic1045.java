package basic2.codeup_basic100;

import java.util.Scanner;

public class basic1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println((int)num1+num2); // 합
//		System.out.println(String.format("%.0f",num1+num2)); // 합
		System.out.println((int)num1-num2); // 차
		System.out.println((int)num1*num2); // 곱
		System.out.println((int)num1/num2); // 몫
		System.out.println((int)num1%num2); // 나머지
		float num3 = (float)num1/num2;
		System.out.println(String.format("%.2f",num3)); // 나누값..?
		
	}

}
