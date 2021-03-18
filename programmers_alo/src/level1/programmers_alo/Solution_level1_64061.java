package level1.programmers_alo;

import java.util.Stack;

public class Solution_level1_64061 {
	public static void main(String[] args) {
		
//	- 게임화면은 n*n의 정사각형
//	- 크레인은 좌우로만 움직인다. 가장 위에 있는 인형을 뽑아 바구니에 쌓는다.
//	- 만일 같은 모양의 인형이 연속해서 바구니에 쌓이면 인형은 터지면서 사라진다. (연속된 인형 모두)
//	- 바구니는 모든 인형이 들어갈 만큼 크다.
//	- 바구니에서 터져서 사라진 인형의 개수 return
//	
//	board 예제 
//	[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
//			
//			[0,0,0,0,0]	
//			[0,0,1,0,3]
//			[0,2,5,0,1]
//			[4,2,4,4,2]
//			[3,5,1,3,1]
//			 1 2 3 4 5
//			 
//			 
//			 [1,5,3,5,1,2,1,4] 이 순서대로 빼서 바구니에 담으면
//			 4,3,1,1,3,2,4순으로 인형이 쌓이고
//			 1,1 삭제-> 3,3삭제해서 총 삭제된 인형은 4개..
		
//		- 작성 순서.
//		board와 moves순서를 받는다..
//		빈 바구니를 만든다. 크기는 board크기만큼 바구니는 스택으로 만들면 될까
//		moves에 따라 board에서 빈 바구니로 옮긴다.. for문을 사용해 moves크기만큼 돌면서 옮기자
//		moves를 y좌표라고 생각하고..해당 위치에서..0부터 n까지 읽어내려가면서 0이 아닌수를 찾고 그 자리에 0을 넣으면 될까.?
//		뺀 인형은 바구니에 담고
//		모두 담은 후에 중복체크..하거나 담으면서 앞의 숫자를 확인하거나. 카운트 변수 필요
//		붙어있는 인형이 2개 이상일 수도 있지 않나..
		
//		- 필요한 변수
//		바구니,중복된 인형 카운트 끝?
		
//		
		int[][] board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = new int[] {1,5,3,5,1,2,1,4};
		Stack<Integer> stack = new Stack<>(); //바구니
		int answer_count = 0;
		int s = 0; //스위치
//		int now_num = 0;
		
		
		for (int i = 0; i < moves.length; i++) {
			s=0;
			for (int j = 0; j < board.length; j++) { 
				if(board[j][moves[i]-1] !=0 && s == 0) { 
//					stack.push(board[j][moves[i]-1]);
//					board[j][moves[i]-1] = 0;
//					s = 1;
					
					//1.스택이 비어있을 때
					if(stack.isEmpty()) {
						stack.push(board[j][moves[i]-1]);
					}else{ // 스택에 값이 있을 때
						if(stack.peek() == board[j][moves[i]-1] ) { //기존의 값이랑 넣을 값이 같을 때
							stack.pop();
							answer_count+=2;
						}else if(stack.peek() != board[j][moves[i]-1]) { //기존값이랑 넣을 값이 다를때
							stack.push(board[j][moves[i]-1]);
						}
					}
					
					board[j][moves[i]-1] = 0;
					s = 1;
					
					
					
				}
			}
//			System.out.println();
		}
		
		
//		  while (!stack.isEmpty()) {
//			  System.out.println(stack.pop());
//          }
//		
//		 System.out.println("stack.size() : "+ stack.size());
//		  for (int i = 0; i < stack.size(); i++) {
//				if(now_num != stack.peek()) {
//					System.out.println("다름");
//					now_num = stack.peek();
//					stack.pop();
//				}else if(now_num == stack.peek()) { //왜 안오지
//					System.out.println("같음");
//					answer_count++;
//					stack.pop();
//				}
//		  } //이렇게 하면.. 11 빠지고 33찾는거 못할 것 같은데..연속된 걸 어떻게 알지.'-' 스택말고..링크드리스트나..배열?
//		
		
		
		  System.out.println("answer_count : "+answer_count);
		
		
	}

}
