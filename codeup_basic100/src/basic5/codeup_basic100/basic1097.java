package basic5.codeup_basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic1097 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] Checkerboard = new int[19][19];
		String row_line = null;
		String[] column_array = null;
		int n = 0; //십자 뒤집기 횟수 
		int x,y=0; //십자 뒤집기 좌표
		
		/* 바둑판 상황 받아서 배열에 저장 */
		for(int i = 0; i < 19; i++) {
			row_line = br.readLine();
			column_array = row_line.split(" ");

			for (int j = 0; j < column_array.length; j++) {
				Checkerboard[i][j] = Integer.parseInt(column_array[j]);
			}
		}
		
		/* n,x,y 받아서 십자뒤집기 */
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
//			System.out.println("n : ----------------------" + i);
			String[] xy = br.readLine().split(" ");

//			x = Integer.parseInt(xy[0]);
//			y = Integer.parseInt(xy[1]);
			
			//(1,1)을 시작으로 봐야하는 건가..
			x = Integer.parseInt(xy[0])-1;
			y = Integer.parseInt(xy[1])-1;
			
//			System.out.println("x : "+ x);
//			System.out.println("y : "+ y);
			
			//뒤집기 어떻게 해야할까..'-'..
			for(int ii = 0; ii <19; ii++) {
//				System.out.println("x좌표값 뒤집기 : "+ x +" / " +ii );
				if(Checkerboard[x][ii] == 0) {
					Checkerboard[x][ii] = 1;
				}else if(Checkerboard[x][ii] == 1){
					Checkerboard[x][ii] = 0;
				}
			}

			
			for(int ii = 0; ii <19; ii++) {
//				System.out.println("y좌표값 뒤집기 : "+ ii +" / " +y );
				if(Checkerboard[ii][y] == 0) {
					Checkerboard[ii][y] = 1;
				}else if(Checkerboard[ii][y] == 1){
					Checkerboard[ii][y] = 0;
				}
			}
		}
		
		
		
		
		/* 출력 */
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				System.out.print(Checkerboard[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
