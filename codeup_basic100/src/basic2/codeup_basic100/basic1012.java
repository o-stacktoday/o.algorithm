package basic2.codeup_basic100;

import java.util.Scanner;
//★
public class basic1012 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float x;
		x = sc.nextFloat();
		String str = String.format("%.6f", x);
		//%.3f 와 같은 형식으로 지정하면,
//		소수점 이하 넷 째 자리에서 반올림하여 소수점 이하 셋 째 자리까지 출력하라는 의미이다.
		System.out.print(str);
	}
}
