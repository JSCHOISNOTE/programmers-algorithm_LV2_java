// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42577

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Set<String> set = new HashSet<>();
        Set<Integer> lengths = new TreeSet();
        // 전화번호 길이 말고 3 6 10 , 전화번호 길이만큼 조회
        //  TreeSet은 값을 정렬된 상태로 유지하는 자료구조 (참조함)
        for (String phone : phone_book) {
            set.add(phone);
            lengths.add(phone.length());
        }
        
        for (String phone : phone_book) {
            for (int i : lengths) {
                if (i >= phone.length()) {
                    break;
                }
                
                if (set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}