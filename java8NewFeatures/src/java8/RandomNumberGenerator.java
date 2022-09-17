package java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        // 10 int random numbers with length <= 4
        IntStream
                .range(0, 11)
                .map(e -> (int) (Math.random()*10000))
                .boxed()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

