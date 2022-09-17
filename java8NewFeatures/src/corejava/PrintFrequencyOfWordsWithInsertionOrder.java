package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrintFrequencyOfWordsWithInsertionOrder {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "bangalore", "vivek", "hello", "vivek", "bangalore", "bangalore");

        Map<String, Integer> map = new TreeMap<>();
        for(String s : list) {
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
