package collectionDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeted {

    public static void main(String[] args) {

        int[] name = {10,20,30,10,20,30};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int ch : name) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println("First non repeated character: " + ch);
                return;
            }
        }

        System.out.println("No non repeated character found");
    }
}