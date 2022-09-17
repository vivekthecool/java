package java8;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {

    public static void main(String[] args) {
        String str1 = "vivek kumar";
        System.out.println("\n" + str1);
        String str2 = IntStream.range(0, str1.length())
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(i -> String.valueOf(str1.charAt(i)))
                .collect(Collectors.joining());
        System.out.println(str2);

    }
}
