package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintFrequencyOfWords {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "bangalore", "vivek", "hello", "vivek", "bangalore", "bangalore");

        list.stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        Function.identity(), Collectors.counting()
                                ))
                .entrySet()
                .forEach(System.out::println);
    }
}
