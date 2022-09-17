package test1;

public class FindMax {
    public static void main(String[] args) {
//        Find the max in the given unsorted array
//        [19,8,7,6,5,4,1,0]  =19
        int[] arr = {1,8,7,6,5,4,1,0};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max number is: " + max);
    }
}
