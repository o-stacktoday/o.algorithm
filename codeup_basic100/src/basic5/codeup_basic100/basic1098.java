package basic5.codeup_basic100;

import java.util.Scanner;

public class basic1098 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] hw_line =  sc.nextLine().split(" ");
		int h , w = 0; //세로 , 가로
		int n = 0 ; //놓은 수있는 막대의 개수
		int l , d ,x ,y = 0; //막대의 길이, 방향(d:가로는 0, 세로는 1) , 좌표 xy
		
		h = Integer.parseInt(hw_line[0]);
		w = Integer.parseInt(hw_line[1]);
		int[][] hw_map = new int[h][w];
		
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String[] ldxy_line = sc.nextLine().split(" ");
			
			l = Integer.parseInt(ldxy_line[0]);
			d = Integer.parseInt(ldxy_line[1]);
			//문제는 (1,1)로 시작하고 나는 (0,0)으로 시작해서
			x = Integer.parseInt(ldxy_line[2])-1;
			y = Integer.parseInt(ldxy_line[3])-1;
//			System.out.println("l : " + l + " d : " + d + " x : " + x + " y : " + y);
			
			if(d == 0) { //가로
				for (int j = y; j < y+l; j++) {
//					System.out.println("x : "+ x + " j :" + j);
					hw_map[x][j] =1;
				}
			}else if(d == 1) { //세로
				for (int j = x; j < x+l; j++) {
//					System.out.println("x : "+ x + " j :" + j);
					hw_map[j][y] =1;
				}
			}
			
		}
		
		
		/* 출력 */
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(hw_map[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
