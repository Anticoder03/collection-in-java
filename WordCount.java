package collectionDemo;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {

        String sentence = "Java is easy Java is powerful";
        
        String[] words = sentence.split("\\s+");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}