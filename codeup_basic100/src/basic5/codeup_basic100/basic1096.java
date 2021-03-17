package basic5.codeup_basic100;

import java.util.Scanner;

public class basic1096 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		int[][] arr = new int[20][20];
		
		sc.nextLine();
		for (int tc = 0; tc < TC; tc++) {
			String[] test = sc.nextLine().split(" ");
			int i =  Integer.parseInt(test[0]);
			int j =  Integer.parseInt(test[1]);
			
			arr[i][j] = 1;
			
		}
		
		for (int i = 1; i <= arr.length-1; i++) {
			for (int j = 1; j <= arr.length-1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
