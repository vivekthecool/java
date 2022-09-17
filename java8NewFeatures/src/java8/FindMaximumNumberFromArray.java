package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindMaximumNumberFromArray {
    public static void main(String[] args) {
//        Find the max in the given unsorted array
//        [19,8,7,6,5,4,1,0]  =19
//        int[] arr = {1,8,7,6,5,4,1,0};
        int[] arr = {19,8,7,6,5,4,1,0};

        System.out.println("Max: " + Arrays
                                        .stream(arr)
                                        .boxed()
                                        .collect(Collectors.toList())
                                        .stream()
                                        .max(Integer::compare)
                                        .get());



    }
}
