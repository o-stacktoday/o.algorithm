package basic2.codeup_basic100;
//https://donggov.tistory.com/48
import java.util.Scanner;

public class basic1034 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num8 = sc.next();
		//8진수를..10진수로..
		//String num10 = Integer.toOctalString(num8);
		int num10 = Integer.parseInt(num8,8);
		System.out.println(num10);
		
		
	}

}
