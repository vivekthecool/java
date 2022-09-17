package corejava;

import java.util.Arrays;

public class SortAnIntArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 99, 9, 8, 7, 6, 0, 5, 4, 3};

        for(int i = 0; i < arr.length; i++) {
            if((i + 1) < arr.length && arr[i] > arr[i + 1]) {
                int t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
