package java8;

import java.util.stream.Collectors;

public class Find1stNonRepeatingCharInString {
    public static void main(String[] args) {
        String str="abcdabgd";

        Character ch = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList())
                .stream()
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst().get();
        System.out.println(ch);
    }
}
