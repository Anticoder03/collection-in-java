package collectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        String name = "Ashish";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : name.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }
}