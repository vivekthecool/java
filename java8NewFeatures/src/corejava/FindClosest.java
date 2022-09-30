package corejava;


import java.util.Arrays;

/**
 * Given an array of sorted integers and find the closest value to the given number.
 * Array may contain duplicate values and negative numbers.
 * Example:
 *      Array: 2,5,6,7,8,8,9
 *          Target number: 5 => Output: 5
 *          Target number: 11 (Corner Case) => Output: 9
 *          Target Number: 4 => Output: 5
 */
public class FindClosest {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,8,9};
        int mid = arr.length / 2;
        System.out.println(findClosestNumber(Arrays.copyOfRange(arr, 0, mid), Arrays.copyOfRange(arr, mid, arr.length), 5));
        System.out.println(findClosestNumber(Arrays.copyOfRange(arr, 0, mid), Arrays.copyOfRange(arr, mid, arr.length), 11));
        System.out.println(findClosestNumber(Arrays.copyOfRange(arr, 0, mid), Arrays.copyOfRange(arr, mid, arr.length), 4));
    }

    private static int findClosestNumber(int[] arr1, int[] arr2, int targetNum) {
        if(arr1[arr1.length - 1] == targetNum || arr2[0] == targetNum)
            return targetNum;
        else if(arr2.length == 1 && arr2[0] < targetNum)
            return arr2[0];
        else if(arr1.length == 1) {
            if(arr1[0] > targetNum)
                return arr1[0];
            return (targetNum - arr1[0]) < (arr2[0] - targetNum) ? arr1[0] : arr2[0];
        }
        else if(arr1[arr1.length - 1] > targetNum) {
            return findClosestNumber(
                    Arrays.copyOfRange(arr1, 0, arr1.length/2),
                    Arrays.copyOfRange(arr1, arr1.length/2, arr1.length),
                    targetNum);
        } else {
            return findClosestNumber(
                    Arrays.copyOfRange(arr2, 0, arr2.length/2),
                    Arrays.copyOfRange(arr2, arr2.length/2, arr2.length),
                    targetNum);
        }
    }
}
