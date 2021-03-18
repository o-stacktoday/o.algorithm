package basic5.codeup_basic100;

import java.util.Scanner;

public class basic1099_1_time_out {
	public static void main(String[] args) {
		
		//개미는 오른쪽으로 가다가 벽이 있으면 내려간다. (한 칸 이동후 )
		//벽이 없으면 왼쪽, 벽이 있으면 밑으로..
		
		//미로상자  0: 갈수있는 곳 , 1: 벽 , 먹이 : 2
		//개미집은 반드시 (2,2)에서 출발
		
		
		/*
		 * 1. 10*10의 미로 상자를 입력받아서 배열에 저장한다. 
		 * 2. (2,2)부터 오른쪽을 확인하고 1이면 밑으로 이동 0이면 왼쪽으로 이동 (문제는 2,2부터 시작 , 나는 1,부터 시작) 
		 * 3. 이때 2를 만나거나 (10,10) / 나는 (9,9)를 만나면..종료
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		String[] row_line;
		int column;
		int[][] map = new int[10][10];
		
		for (int i = 0; i < 10; i++) {
			row_line = sc.nextLine().split(" ");
			for (int j = 0; j < row_line.length; j++) {
				column = Integer.parseInt(row_line[j]);
				map[i][j] = column;
			}
		}
		
		//끝날때까지 반복해야 하니까..while쓰면 되지 않을까..
		//(1,1)의 오른쪽이  1이냐 0이냐 
		//1이면 아래로 이동
		//0이면 오른쪽으로 이동
		//현재 좌표값 필요?
		
		int now_x , now_y = 0; //현재 좌표값
		now_x = 1;
		now_y = 1;
//		map[now_x][now_y] = 9;
		
		while(true) { // 방향이 오른쪽 아래만 있으니까..for문 써도 되나
		
			
			if(map[now_x][now_y] == 2 || (now_x == 9 && now_y == 9) ) {
				
				map[now_x][now_y] = 9;
				
				
				/* 출력 */
				for(int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						System.out.print(map[i][j]+" ");
					}
					System.out.println();
				}
				
				
				break;
			}
			
			
			if( map[now_x][now_y+1] == 1 && map[now_x][now_y+1] != 2 && now_x != 9 && now_y != 9 ) {
				map[now_x][now_y] = 9;
				now_x = now_x+1;
			}else if( map[now_x][now_y+1] == 0 && map[now_x][now_y] != 2 && now_x != 9 && now_y != 9) {
				map[now_x][now_y] = 9;
				now_y = now_y+1;
			}
		
		}//while
		

		
	}

}
