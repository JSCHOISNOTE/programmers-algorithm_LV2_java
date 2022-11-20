// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42885

import java.util.Arrays;

class Solution {
	public static int solution(int[] people, int limit) {
		int answer = 0;
        // 배열 people 정렬
		Arrays.sort(people);
        
		int index = 0;
        
		for (int i = people.length - 1; i >= 0; i--) {
			if (index > i) {
				break;
			}
			if (people[i] + people[index] <= limit) {
				index++;
			}
			answer++;
		}
		return answer;
	}
}