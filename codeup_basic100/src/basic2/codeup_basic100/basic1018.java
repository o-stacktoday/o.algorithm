package basic2.codeup_basic100;

import java.util.Scanner;

public class basic1018 {
	
	public static void main(String[] args) {
		
		//Strinig to int
		//String from = "123";
		//int to = Integer.parseInt(from);


//		int to String
//		int from = 123;
//		String to = Integer.toString(from);

		Scanner sc = new Scanner(System.in);
		String test = sc.next();
		String[] arg = test.split(":");
		int h,m;
//		System.out.println(arg[0] );
//        System.out.println(arg[1] );
        
        h = Integer.parseInt(arg[0]);
        m = Integer.parseInt(arg[1]);
        
        System.out.println(h+":"+m);
		
		/*
		 * //--------------------------------------------------- 
		 * Scanner sc = new
		 * Scanner(System.in); 
		 * String test = sc.next(); 
		 * System.out.println(test);
		 * //------------------------------------------------------
		 */        
	}

}
