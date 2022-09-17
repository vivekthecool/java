package corejava;

import java.util.*;

public class CheckWhetherTwoStringAreSameOrNot {
    public static void main(String[] args) {
//        sameLetters("GOD","DOG");
        sameLetters("GOD","CAT");
    }

    private static void sameLetters(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        if(s1.length() != s2.length()) {
            System.out.println("Not Same");
            return;
        }

        for(Character c: s1.toCharArray()) {
            if(map1.containsKey(c)) map1.put(c, map1.get(c) + 1);
            else map1.put(c, 1);
        }

        for(Character c: s2.toCharArray()) {
            if(map2.containsKey(c)) map2.put(c, map2.get(c) + 1);
            else map2.put(c, 1);
        }

        for(Map.Entry<Character, Integer> e: map1.entrySet()) {
            if(e.getValue() != map2.get(e.getKey())) {
                System.out.println("Not Same");
                return;
            }
        }
        System.out.println("Same");
    }
}
