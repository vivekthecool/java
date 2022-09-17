package java8;

import java.util.Arrays;
import java.util.List;

public class Find2ndSmallestNumberInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,1,8,3,9,5);
        Integer n = list.stream().sorted().skip(1).findFirst().get();
        System.out.println(n);
    }
}
