package level1.programmers_alo;

import java.util.HashSet;
import java.util.Set;

public class Solution_level1_68644_others1 {
	public int[] solution(int[] numbers) {
		numbers = new int[] {2,1,3,4,1};
		int[] answer = {};
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		System.out.println(set.stream().sorted().mapToInt(Integer::intValue).toArray());
//		set.stream().sorted().mapToInt(Integer::intValue).toArray();
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
}

/*
 * - stream() 
 * https://futurecreator.github.io/2018/08/26/java-8-streams/
 * �ڹ� 8���� �߰��� ��Ʈ���� ���ٸ� Ȱ���� �� �ִ� ����̴�.
 * �ڹ�8 �������� �迭 �Ǵ� �÷��� �ν��Ͻ��� �ٷ�� ������� for, foreach���� ���鼭 ��� �ϳ����� ������ �ٷ����.
 * �� ��� ������ ������������ �ڵ��� ���� ������ ���� ������ ���̰Եǰ�, �޼ҵ带 ���� ��� ������ ������ ���� ��찡 �����.
 * ��Ʈ���� '�������� �帧'���� �迭 �Ǵ� �÷��� �ν��Ͻ��� �Լ� �������� �����ؼ� ���ϴ� ����� ���͸��ϰ� ������ ����� ���� �� �ִ�.
 * 
 * 
 * - sorted()
 * �����ϴ� ���
 * ���ھ��� ȣ���� ��� �������� 
 * 
 * - mapToInt()
 * InstStream���� �ٲ��ش�..
 */