package java8;

import java.util.stream.IntStream;

public class PrintNumberFromRangeWhichContainsOne {
    public static void main(String[] args) {
        IntStream.range(1, 100).filter(n -> {
            while(n > 0) {
                if((n % 10) == 1) {
                    return true;
                }
                n = n / 10;
            }
            return false;
        }).forEach(System.out::println);
    }
}
