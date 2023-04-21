// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/60058

import java.util.*;

class Solution {
    public String solution(String p) {
        String answer = dfs(p);
        return answer;
    }
    
    public static String dfs(String w){
        
        /* 입력이 빈 문자열인 경우 빈 문자열 반환 */
        if(w.length() == 0){
            return "";
        }
        
        String u = "";
        String v = "";
        int lcnt = 0;
        int rcnt = 0;
        
        /* 문자열 w를 균형잡힌 괄호 문자열 u,v로 분리 */
        for(int i=0; i<w.length(); i++){
            if(w.charAt(i) == '('){
                lcnt++;
            }else rcnt++;
            u += w.charAt(i);
            if(lcnt == rcnt){
                v = w.substring(i+1);
                break;
            }
        }
        
        /* 문쟈열 u가 올바른 괄호 문자열이라면 문자열 v에 대해 1단계부터 다시 수행 */
        if(isCorrect(u)){
            return u += dfs(v); // 수행한 결과 문자열을 u에 이어 붙인 후 반환
        }
        /* 문자열 u가 올바른 괄호 문자열이 아니라면 */
        else{
            String temp = "(";  // 빈 문자열에 첫 번째 문자로 '('를 붙임
            temp += dfs(v);     // 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열 이어 붙임
            temp += ")";        // ')'를 붙임
            u = u.substring(1, u.length()-1);   // u의 첫번째와 마지막 문자 제거
            /* 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙임 */
            for(int i=0; i<u.length(); i++){
                if(u.charAt(i) =='('){
                    temp += ')';
                }else{
                    temp += '(';
                }
            }
            
            return temp;    // 생성된 문자열 반환
        }
        
    }
    
    /* 올바른 괄호 문자열 체크 함수 */
    public static boolean isCorrect(String str){
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                st.push('(');
            }else{
                if(st.isEmpty() || st.peek() == ')' ){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        
        return true;
    }
}
