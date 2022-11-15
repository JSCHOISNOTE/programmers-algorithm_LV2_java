// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/70129

class Solution {
  public int[] solution(String s) {
      // 리턴할 answer 배열의 크기를 2로 선언
    int[] answer = new int[2];
 // s의 길이가 1이 될 때까지 반복
    while(s.length() > 1) {
 // 1의 개수를 세어줄 int형 변수 선언
      int cntOne = 0;
      for(int i=0; i<s.length(); i++) {
 
        if(s.charAt(i) == '0') answer[1]++;
        else cntOne++;
      }
 // 1의 개수를 toBinaryString() 사용해서 이진수로 변경하고 s 에 넣어두고 변경
      s = Integer.toBinaryString(cntOne);
      answer[0]++;
    }
 
    return answer;
  }
}