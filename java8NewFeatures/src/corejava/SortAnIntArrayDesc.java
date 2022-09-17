package corejava;

import java.util.Arrays;

public class SortAnIntArrayDesc {
    public static void main(String[] args) {
        int[] arr = {4,7,1,3,6,5,2};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1 ; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
