package basic4.codeup_basic100;
//https://tdays.net/%EC%A0%95%EC%88%98%EB%A5%BC-2%EC%A7%84%EC%88%988%EC%A7%84%EC%88%9816%EC%A7%84%EC%88%98%EB%A1%9C-%EC%9E%85%EB%A0%A5-%EB%B0%9B%EA%B8%B0/
//http://mwultong.blogspot.com/2006/09/java-10-16-hex.html
import java.util.Scanner;

public class basic1082 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ch = sc.next(); 
		int Integer16 = Integer.valueOf(ch, 16); // 정수를 16진수로 입력받기
	    String str16 = String.format("%X",Integer16); // 16진수 문자열로 변환
		// 왜 줄바꿈이 될까..
		for(int i = 1; i <= 15; i++) {
			int sum = Integer16 * i;
//			System.out.println(str16+"*"+String.format("%2X",i)+"="+String.format("%2X",sum));
			String ans = str16+"*"+String.format("%X",i)+"="+String.format("%X",sum);
			System.out.println(ans);
		}
		
	}
}
//.toUpperCase()