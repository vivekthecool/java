package corejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatingElementInArray {
    public static void main(String[] args) {
//        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        Set<Integer> set = new HashSet<>();
        int n = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(set.contains(arr[i])) {
                n = arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(n);
    }
}
