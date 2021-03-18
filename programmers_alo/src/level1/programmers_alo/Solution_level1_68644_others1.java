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
 * 자바 8에서 추가한 스트림은 람다를 활용할 수 있는 기술이다.
 * 자바8 이전에는 배열 또는 컬렉션 인스턴스를 다루는 방법으로 for, foreach문을 돌면서 요소 하나씩을 꺼내서 다뤘었다.
 * 이 경우 로직이 복잡해질수록 코드의 양이 많아져 여러 로직이 섞이게되고, 메소드를 나눌 경우 루프를 여러번 도는 경우가 생긴다.
 * 스트림은 '데이터의 흐름'으로 배열 또는 컬렉션 인스턴스에 함수 여러개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다.
 * 
 * 
 * - sorted()
 * 정렬하는 방법
 * 인자없이 호출할 경우 오름차순 
 * 
 * - mapToInt()
 * InstStream으로 바꿔준다..
 */