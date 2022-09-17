package corejava;

import java.util.*;

public class ModifyMapValues {
    public static void main(String[] args) {
//        o/p: - x, y => x, (12+22, 11+21, 10+20)
        Map<String, List<String>> map = new HashMap<>();
        map.put("x", Arrays.asList("12.00", "11.00", "10.00"));
        map.put("y", Arrays.asList("22.00", "21.00", "20.00"));
        List<String> list = new ArrayList<>();

        for(Map.Entry<String, List<String>> e: map.entrySet()) {
            System.out.println(e.getKey() + ": " +e.getValue());
        }

        for(int i = 0; i < map.get("y").size(); i++) {
            Double d1 = Double.parseDouble(map.get("y").get(i)) + Double.parseDouble(map.get("x").get(i));
            list.add(String.valueOf(d1));
        }
        map.put("x", list);

        for(Map.Entry<String, List<String>> e: map.entrySet()) {
            System.out.println(e.getKey() + ": " +e.getValue());
        }
    }
}
