package java8;

import java.util.Arrays;

public class PrintUniqueElementFromList {
    public static void main(String[] args) {
        Arrays
                .asList(1,7,9,8,8,10)
                .stream()
                .distinct()
                .forEach(System.out::print);
    }
}
