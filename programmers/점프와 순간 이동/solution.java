// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12980

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        /*
        주어진 n이 0이 될 때까지 n이 짝수일때 n /=2 n이 홀수이면 n -= 1
        몇 칸 점프를 할건지, 순간이동 할건지를 짝수 홀수로 경우의 수를 줄이고
        자연수 이므로 0보다 작아지는 경우의 수는 없기 때문에 제외한다.
        */
        while(n != 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }
        return ans;
    }
}