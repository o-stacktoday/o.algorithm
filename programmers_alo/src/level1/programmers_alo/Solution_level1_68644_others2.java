package level1.programmers_alo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution_level1_68644_others2 {
	//public int[] solution(int[] numbers) {
	public static void main(String[] args) {
		int[] numbers = new int[] {2,1,3,4,1};
		
		Set<Integer> sumNumber = new TreeSet();
		
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				sumNumber.add(numbers[i]+numbers[j]);
			}
		}
		
		int[] answer = new int[sumNumber.size()];
		int index = 0;
		
		Iterator itor = sumNumber.iterator();
		while(itor.hasNext()) {
			answer[index] = (int) itor.next();
			index++;
		}
		System.out.println(Arrays.toString(answer));
//		return answer;
	}
}

/*- TreeSet
https://coding-factory.tistory.com/555
TreeSet�� Hashset�� ���������� Set�������̽��� ������ Ŭ�����ν� ��ü�� �ߺ��ؼ� ������ �� ���� ������ �������� �ʴ´�.
HashSet�� �޸� TreeSet�� ���� Ž��Ʈ�������� �̷����־�,�߰��� �������� �ð��� ���� �� �ɸ�����, ����, �˻����� ���� ������ ���δ�.

- TreeSet ����  (���� �� ũ�⸦ ������ ���� ����.)
TreeSet<Integer> set1 = new TreeSet<Integer>(); //TreeSet����
TreeSet<Integer> set2 = new TreeSet<>();//new���� Ÿ�� �Ķ���� ���� ����
TreeSet<Integer> set3 = new TreeSet<Integer>(set1);//set1�� ��� ���� ���� TreeSet����
TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3)); //�ʱⰪ�� ����

- TreeSet �� �߰�
TreeSet<Integer> set = new TreeSet<Integer>();
set.add(7);
set.add(5);
- TreeSet �� ����
set.remove(1);
set.clear();//��� �� ����
- TreeSet ũ��
set.size();
- TreeSet �� ���
System.out.println(set); //��ü ���
System.out.println(set.first());//�ּҰ����
System.out.println(set.last());//�ִ밪���
System.out.println(set.higher(3)); //�Է°����� ū ������ �� �ּҰ� ��� ������ null
System.out.println(set.lower(3)); //�Է°����� ���� ������ �� �ִ밪 ��� ������ null

Iterator iter = set iterator();
while(iter.hasNext()) { 
	System.out.println(iter.next());
}*/
