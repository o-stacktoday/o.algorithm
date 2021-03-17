package basic4.codeup_basic100;

import java.util.Scanner;

public class basic1088 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num; i++) {
			if(i % 3 != 0) {
				System.out.print(i+" ");
			}
			
		}
	}

}
