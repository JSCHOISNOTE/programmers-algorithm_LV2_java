// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/60057

class Solution {
    public int solution(String s) {
        int answer = s.length();
        int count = 1;
        for(int i=1; i<=s.length()/2; i++){
            StringBuilder result = new StringBuilder();
            String base = s.substring(0, i);
            for(int j=i; j<=s.length(); j+=i){
                // base에서 count 함 
                int endIdx = Math.min(j + i, s.length());   
                
                
                String compare = s.substring(j, endIdx);
                if(base.equals(compare)){
                    count++;
                } else {
                    if(count >= 2){
                        result.append(count);
                    }
                    result.append(base);
                    base = compare;     
                    // 나머지가 생길 수 있으므로 한번 더 
                    count = 1;
                }
            }
            result.append(base);    
            // 문자붙임
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}