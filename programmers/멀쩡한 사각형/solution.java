// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/62048

class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        // 사각형의 합 구하고 대칭이므로 곱하기 2를 해준 뒤 반환
        long x = (long)w;
        long y = (long)h;
        
        for(int i=1; i<w; i++){
            answer += y*i / x ;
        }
        
        return answer*2;
    }
}