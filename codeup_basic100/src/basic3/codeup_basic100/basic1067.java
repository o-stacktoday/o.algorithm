package basic3.codeup_basic100;

import java.util.Scanner;

public class basic1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) { //양수
			System.out.println("plus");
			
			if(num % 2 == 0) { // 짝수
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			
			
		}else { // 음수
			System.out.println("minus");
			
			if(num % 2 == 0) { // 짝수
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}

}
