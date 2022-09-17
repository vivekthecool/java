package test;

import utility.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintPersonIdWhoseNameStartsWithA {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        Person.getPersonList(list);

        list
                .stream()
                .filter(p -> p.getName().charAt(0) == 'a')
                .map(p -> p.getId())
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        List<Person> list11 = list
//                .stream()
//                .sorted(Comparator.comparing(Person::getName))
//                .collect(Collectors.toList());

//        String str = "aabbc";
////        a=2, b=2, c=1
//       Arrays.asList(str.toCharArray())
//                                            .stream()
//                                            .collect(Collectors
//                                                    .groupingBy(Function.identity(), Collectors.counting()))
//               .entrySet().forEach(e -> System.out.println(e.getKey() +", "+e.getValue()));
    }
}