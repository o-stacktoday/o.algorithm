package level1.programmers_alo;

import java.util.Stack;

public class Solution_level1_64061 {
	public static void main(String[] args) {
		
//	- ����ȭ���� n*n�� ���簢��
//	- ũ������ �¿�θ� �����δ�. ���� ���� �ִ� ������ �̾� �ٱ��Ͽ� �״´�.
//	- ���� ���� ����� ������ �����ؼ� �ٱ��Ͽ� ���̸� ������ �����鼭 �������. (���ӵ� ���� ���)
//	- �ٱ��ϴ� ��� ������ �� ��ŭ ũ��.
//	- �ٱ��Ͽ��� ������ ����� ������ ���� return
//	
//	board ���� 
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
//			 [1,5,3,5,1,2,1,4] �� ������� ���� �ٱ��Ͽ� ������
//			 4,3,1,1,3,2,4������ ������ ���̰�
//			 1,1 ����-> 3,3�����ؼ� �� ������ ������ 4��..
		
//		- �ۼ� ����.
//		board�� moves������ �޴´�..
//		�� �ٱ��ϸ� �����. ũ��� boardũ�⸸ŭ �ٱ��ϴ� �������� ����� �ɱ�
//		moves�� ���� board���� �� �ٱ��Ϸ� �ű��.. for���� ����� movesũ�⸸ŭ ���鼭 �ű���
//		moves�� y��ǥ��� �����ϰ�..�ش� ��ġ����..0���� n���� �о�����鼭 0�� �ƴѼ��� ã�� �� �ڸ��� 0�� ������ �ɱ�.?
//		�� ������ �ٱ��Ͽ� ���
//		��� ���� �Ŀ� �ߺ�üũ..�ϰų� �����鼭 ���� ���ڸ� Ȯ���ϰų�. ī��Ʈ ���� �ʿ�
//		�پ��ִ� ������ 2�� �̻��� ���� ���� �ʳ�..
		
//		- �ʿ��� ����
//		�ٱ���,�ߺ��� ���� ī��Ʈ ��?
		
//		
		int[][] board = new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = new int[] {1,5,3,5,1,2,1,4};
		Stack<Integer> stack = new Stack<>(); //�ٱ���
		int answer_count = 0;
		int s = 0; //����ġ
//		int now_num = 0;
		
		
		for (int i = 0; i < moves.length; i++) {
			s=0;
			for (int j = 0; j < board.length; j++) { 
				if(board[j][moves[i]-1] !=0 && s == 0) { 
//					stack.push(board[j][moves[i]-1]);
//					board[j][moves[i]-1] = 0;
//					s = 1;
					
					//1.������ ������� ��
					if(stack.isEmpty()) {
						stack.push(board[j][moves[i]-1]);
					}else{ // ���ÿ� ���� ���� ��
						if(stack.peek() == board[j][moves[i]-1] ) { //������ ���̶� ���� ���� ���� ��
							stack.pop();
							answer_count+=2;
						}else if(stack.peek() != board[j][moves[i]-1]) { //�������̶� ���� ���� �ٸ���
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
//					System.out.println("�ٸ�");
//					now_num = stack.peek();
//					stack.pop();
//				}else if(now_num == stack.peek()) { //�� �ȿ���
//					System.out.println("����");
//					answer_count++;
//					stack.pop();
//				}
//		  } //�̷��� �ϸ�.. 11 ������ 33ã�°� ���� �� ������..���ӵ� �� ��� ����.'-' ���ø���..��ũ�帮��Ʈ��..�迭?
//		
		
		
		  System.out.println("answer_count : "+answer_count);
		
		
	}

}
