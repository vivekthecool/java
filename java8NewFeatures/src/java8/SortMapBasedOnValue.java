package java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortMapBasedOnValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 3);
        map.put("3", 1);
        map.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(System.out::println);

    }
}
