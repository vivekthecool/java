package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortMapBasedOnValue {
    public static void main(String[] args) {
//        HashMap<String, Long> map = new HashMap<>();
//        map.put("a", 2l);
//        map.put("b", 1l);
//        map.put("c", 3l);
//        map
//                .entrySet()
//                .stream()
//                .sorted(Comparator.comparing(Map.Entry::getValue))
//                .forEach(e -> System.out.println(e.getKey() + ": "+ e.getValue()));

        String input = "a2p3c2";
//        o/p: - aapppcc
        Character c = null;
        int num = 0;

        for(int i = 0; i < input.length(); i++) {
            if(Objects.isNull(c)) {
                c = (char) input.charAt(i);
            } else if(num == 0) {
                num = Integer.parseInt(input.charAt(i)+"");
            }

            for(int j = 0; j < num && num > 0; j++) {
                System.out.print(c);
            }
            if(Objects.nonNull(c) && num > 0) {
                c = null;
                num = 0;
            }
//            i++;
        }
    }
}
