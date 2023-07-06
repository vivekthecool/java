package java8;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayBasedOnLengthAndAlphabet {
    public static void main(String[] args) {
        String input[] = {};

        Arrays.asList(input)
                .stream()
                .sorted()
                .sorted(Comparator.comparing(s -> s.length()))
                .forEach(System.out::println);
    }
}
