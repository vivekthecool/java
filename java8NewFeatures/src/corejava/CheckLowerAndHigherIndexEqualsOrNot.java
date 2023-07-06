package corejava;

/**
 * Array => -7, 1, 5, 2, -4, 3, 0
 * sum of lower index = sum of higher index
 * SUM(-7, 1, 5) == SUM(-4, 3, 0)
 *
 * Array => -7, 1, 5, 2, -4, 3
 * SUM(-7, 1, 5) == SUM(2, -4, 3)
 */
public class CheckLowerAndHigherIndexEqualsOrNot {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
//        int[] arr = {-7, 1, 5, -4, 3, 0};
//        int[] arr = {-7, 1, 5, 2, -4, 3};

        int mid = arr.length / 2;
        int lowerIndex = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i < mid) {
                lowerIndex += arr[i];
            } else if(i > mid) {
                lowerIndex -= arr[i];
            }
        }

        System.out.println((lowerIndex == 0 ? "Equal" : "Not Equal"));
    }
}
