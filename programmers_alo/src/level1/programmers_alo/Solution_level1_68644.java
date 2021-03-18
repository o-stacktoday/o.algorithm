package level1.programmers_alo;
//https://korbillgates.tistory.com/120
//https://lnsideout.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%EB%B0%B0%EC%97%B4-ArrayList-%EC%A4%91%EB%B3%B5%EC%A0%9C%EA%B1%B0-%EB%AA%A8%EB%93%A0%EB%B0%A9%EB%B2%95

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
//더한 값들을 중복 제거 + 정렬
public class Solution_level1_68644 {
	//public int[] solution(int[] numbers) {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		//int[] numbers = {1, 2, 4, 8, 16, 32, 64};
		int[] answer = {};
		HashSet<Integer> ans = new HashSet<>();
		
		for(int i =0; i < numbers.length-1; i++){
            for(int j =i+1; j < numbers.length; j++){
                ans.add(numbers[i]+numbers[j]);
            }
        }
		
		
		TreeSet myTreeSet = new TreeSet();
		myTreeSet.addAll(ans);
		
	   answer = new int[myTreeSet.size()];
        
        Iterator<Integer> iter = myTreeSet.iterator();
        
        for(int i=0; i<ans.size();i++){
            if(iter.hasNext()){
                answer[i] = iter.next();
            }
        }
		
        System.out.println(Arrays.toString(answer));
		//return answer;
	}
}
