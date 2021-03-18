package basic5.codeup_basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic1099_3 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] row_line;
		int column;
		int[][] map = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			row_line = br.readLine().split(" ");
			for (int j = 0; j < 10; j++) {
				column = Integer.parseInt(row_line[j]);
				map[i][j] = column;
			}
		}
		
		int now_x , now_y = 0; //현재 좌표값
		now_x = 1;
		now_y = 1;
		
		for (int t = 0; t < 100; t++) {
			
		
			
			if(map[now_x][now_y] == 2 || (now_x == 9 && now_y == 9) || (map[now_x+1][now_y] == 1 && map[now_x][now_y+1] == 1)) {
				map[now_x][now_y] = 9;
				
				/* 출력 */
				for(int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						System.out.print(map[i][j]+" ");
					}
					System.out.println();
				}
				
				return;
			}
			
			
			if( map[now_x][now_y+1] == 1 && now_x != 9 && now_y != 9 ) {
				map[now_x][now_y] = 9;
				now_x = now_x+1;
			}else if( map[now_x][now_y+1] == 0 && now_x != 9 && now_y != 9) {
				map[now_x][now_y] = 9;
				now_y = now_y+1;
			}else if(map[now_x][now_y+1] == 2  ) {
				map[now_x][now_y] = 9;
				now_y = now_y+1;
			}else if(map[now_x+1][now_y] == 2) {
				map[now_x][now_y] = 9;
				now_x = now_x+1;
			}
		
		}

		
	}

}
