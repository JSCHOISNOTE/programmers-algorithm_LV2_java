// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/17680

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();
        
        // 캐시 크기가 0일 경우 5씩 곱해서 return 함
        if(cacheSize == 0) // 캐시크기가 0
            return cities.length * 5;
        
        for(int i=0; i<cities.length; i++) {
            cities[i] = cities[i].toUpperCase(); // 대소문자 구분X
            if(cache.contains(cities[i])) { // cache hit
                cache.remove(cities[i]);
                cache.add(cities[i]);
                answer += 1;
            }
            // 캐치 미스면 캐시에 삽입하는데 공간이 없다면 맨 처음에 들어간 캐시 삭제하고 추가
            else { // cache miss
                if(cache.size()==cacheSize) {
                    cache.remove(0);
                    cache.add(cities[i]);
                }
                else
                    cache.add(cities[i]);
                answer += 5;
            }
        }
        return answer;
    }
}