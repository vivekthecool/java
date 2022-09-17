package corejava;

import java.util.ArrayList;
import java.util.List;

public class CreateGenericListAndPrint {

    public static void main(String[] args) {
//        ArrayList -> 2 int 2 string values then print those using foreach loop
        List<Object> list = new ArrayList<>();

        list.add(123);
        list.add(234);
        list.add("vivek");
        list.add("kumar");

        for(Object o: list) {
            System.out.println(o);
        }
    }
}
