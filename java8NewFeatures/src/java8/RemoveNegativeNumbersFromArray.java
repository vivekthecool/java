package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativeNumbersFromArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,24,-1,8,-3,0));
        numbers = numbers.stream()
                        .filter(n -> n >= 0)
                                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}