package java8;

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
    }
}