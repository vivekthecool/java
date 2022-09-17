package test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Impulsys {

    public static void main(String[] args) {
//        list of person => size = 10 => first 5 name = a last 5 name = b

//        List<Person> list = new ArrayList<>();
//
//        List<Integer> list1 = list
//                                .stream()
//                                .filter(p -> p.name.indexOf(0) == 'a')
//                                .map(p -> p.id)
//                                .collect(Collectors.toList());
////        n+1
//
//        List<Person> list11 = list
//                .stream()
//                .sorted(Comparator.comparing(Person::getName))
//                .collect(Collectors.toList());

        String str = "aabbc";
//        a=2, b=2, c=1
       Arrays.asList(str.toCharArray())
                                            .stream()
                                            .collect(Collectors
                                                    .groupingBy(Function.identity(), Collectors.counting()))
               .entrySet().forEach(e -> System.out.println(e.getKey() +", "+e.getValue()));
    }
}

class Person {
    int id;
    String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}