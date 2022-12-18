// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42587

import java.util.*;


class Solution {
   
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // 1. 큰 수가 우선순위를 갖는 우선순위 큐.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // 2. priorities값을 우선순위 큐에 담는다.
        for(int n : priorities){
            pq.offer(n);
        }
        
        // 3. 큐가 빌 때 까지 반복 == 모든 대기목록이 비워질 때 까지.
        while(!pq.isEmpty()){
            // 4. 큐에서 나오는 값과 매칭되는 경우를 탐색.
            for(int i = 0;i<priorities.length;i++){
                // 5. 값만 일치하는 경우 해당 문서 출력.
                if(pq.peek() == priorities[i] ){
                    pq.poll();
                    answer++;
                    // 6. 값과 위치가 모두 일치하면 answer을 반환.
                    if(location == i ) return answer;
                }
            }
            
        }
                
        return answer;
    }
}