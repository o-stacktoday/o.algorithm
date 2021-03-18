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
TreeSet은 Hashset과 마찬가지로 Set인터페이스를 구현한 클래스로써 객체를 중복해서 저장할 수 없고 순서가 유지되지 않는다.
HashSet과 달리 TreeSet은 이진 탐색트리구조로 이뤄져있어,추가와 삭제에는 시간이 조금 더 걸리지만, 정렬, 검색에는 높은 성능을 보인다.

- TreeSet 선언  (선언 시 크기를 지정할 수는 없다.)
TreeSet<Integer> set1 = new TreeSet<Integer>(); //TreeSet생성
TreeSet<Integer> set2 = new TreeSet<>();//new에서 타입 파라미터 생략 가능
TreeSet<Integer> set3 = new TreeSet<Integer>(set1);//set1의 모든 값을 가진 TreeSet생성
TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3)); //초기값을 지정

- TreeSet 값 추가
TreeSet<Integer> set = new TreeSet<Integer>();
set.add(7);
set.add(5);
- TreeSet 값 삭제
set.remove(1);
set.clear();//모든 값 제거
- TreeSet 크기
set.size();
- TreeSet 값 출력
System.out.println(set); //전체 출력
System.out.println(set.first());//최소값출력
System.out.println(set.last());//최대값출력
System.out.println(set.higher(3)); //입력값보다 큰 데이터 중 최소값 출력 없으면 null
System.out.println(set.lower(3)); //입력값보다 작은 데이터 중 최대값 출력 없으면 null

Iterator iter = set iterator();
while(iter.hasNext()) { 
	System.out.println(iter.next());
}*/
