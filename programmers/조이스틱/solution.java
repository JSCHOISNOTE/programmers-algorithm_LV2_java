// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42860

import java.util.Arrays;
class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1; // 오른쪽으로 쭉 간 횟수
        
        for(int i = 0; i < name.length(); i++) {
            //상,하 알파벳 맞추기
            answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A')); 

            if (i < name.length() - 1 && name.charAt(i + 1) == 'A') {
                int endA = i + 1;
                while(endA < name.length() && name.charAt(endA) == 'A')
                    endA++;
                // 오른쪽으로 갔다 다시 왼쪽으로 꺾기
                move = Math.min(move, i * 2 + (name.length() - endA));
                // 왼쪽으로 갔다 다시 오른쪽으로 꺾기
                move = Math.min(move, i + (name.length() - endA) * 2);
            }
        }
        return answer + move;
    }
}