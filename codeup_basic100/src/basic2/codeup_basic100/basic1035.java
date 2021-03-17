package basic2.codeup_basic100;
//https://donggov.tistory.com/48
import java.util.Scanner;

public class basic1035 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//16-> 10 ->8
		String num16 = sc.next();
		int num10 = Integer.parseInt(num16,16);
		String num8 = Integer.toOctalString(num10);
		System.out.println(num8);
		
		
	}
}

//흠...이렇게 하는게 맞는건가........................................................................