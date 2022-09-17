package corejava;

public class Find3rdHighestNumber {

    public static void main(String[] args) {
        Integer arr[] = {8, 5, 2, 4, 1, 9, 3, 7};
//        Optional op = Arrays.asList(arr).stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
//        System.out.println(op.get());

        Integer first = arr[0];
        Integer sec = arr[0];
        Integer third = 0 ;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > first)
                first = arr[i];
            else if(arr[i] < first && arr[i] > sec)
                sec = arr[i];
            else if(arr[i] < sec && arr[i] > third)
                third = arr[i];
        }
        System.out.println(third);
    }
}
