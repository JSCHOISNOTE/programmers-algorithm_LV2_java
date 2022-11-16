// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12924

class Solution {
      public int solution(int n) {
          int answer = 0;
          // for문 두번 사용해서 1부터 더하다가 n과 같아지면 break
          for(int i=1; i<=n; i++) {
              int sum = 0;
              
              for(int j=i; j<=n; j++) {
                  sum += j;
                  
                  if(sum == n) {
                      answer++;
                      
                      break;
                  } else if(sum > n) {
                      break;
                  }
              }
          }      
          return answer;
      }
    }