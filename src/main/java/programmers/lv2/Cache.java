package programmers.lv2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Seunghyun Kim
 * @since 2020-05-13
 */
public class Cache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        List<String> cache = new LinkedList<>();
        for (String city : cities) {
            city = city.toLowerCase();
            int cacheIdx = cache.indexOf(city);
            if (cacheIdx != -1) {
                cache.remove(city);
                cache.add(0, city);
                answer += 1;
            } else {
                if(cache.size() == cacheSize){
                    cache.remove(cache.size()-1);
                }
                cache.add(0,city);
                answer += 5;
            }
        }
        return answer;
    }

}
