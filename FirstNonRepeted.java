package collectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeted {

    public static void main(String[] args) {

        String name = "Ashish";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : name.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println("First repeated character: " + ch);
                return;
            }
        }

        System.out.println("No repeated character found");
    }
}