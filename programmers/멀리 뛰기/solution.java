// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12914

class Solution {
  public long solution(int n) {
      int[] dp = new int[2001];
      
      dp[1] = 1;
      dp[2] = 2;
      // 오버플로우 때문에 dp [i]을 구할 때마다 1234567로 나눈 나머지를 해줘야 함
      for(int i=3; i<2001; i++){
          dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
      }
      
      return dp[n];
  }
}