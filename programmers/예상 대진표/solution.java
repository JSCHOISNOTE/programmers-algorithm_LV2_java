// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12985

class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        /*
        라운드 올라갈 때 마다 참가자의 순서가 바뀌게 되니깐 A와 B는 항상 이긴다고 가정했으므로
        A와 B가 다음 라운드로 갈 경우 순서만 생각해서 해결
        */
        while(true){
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer ++;
            
            if(a == b)
                break;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}