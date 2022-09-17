package java8;

import java.util.Random;
import java.util.stream.IntStream;

public class Print5RandomNumbers {
    public static void main(String[] args) {
        IntStream
                .range(0, 5)
                .map(i -> new Random().nextInt()/10000000) // divide to manage number of digit
                .forEach(System.out::println);
    }
}
