package basic4.codeup_basic100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class basic1084 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i <= r-1; i++) { 
			for (int j = 0; j <= g-1; j++) { 
				String ans = "";
				for (int j2 = 0; j2 <= b-1; j2++) { 
					ans += i + " "+ j + " " + j2+"\n"; 
			 	}
				bf.write(ans);
				bf.flush();
			} 
		} 
		System.out.println(r*g*b);
		
		
		
		/* 시간초과
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int r = sc.nextInt(); 
		 * int g = sc.nextInt(); 
		 * int b = sc.nextInt(); 
		 * int total = 0;
		 * 
		 * for (int i = 0; i <= r-1; i++) { 
		 * 		for (int j = 0; j <= g-1; j++) { 
		 * 			for (int j2 = 0; j2 <= b-1; j2++) { 
		 * 				System.out.println(i + " "+ j + " " + j2); 
		 * 				total++; 
		 * 			}
		 * 		} 
		 * } 
		 * System.out.println(total);
		 */		
	}
}
