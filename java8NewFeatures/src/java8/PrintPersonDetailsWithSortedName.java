package java8;

import utility.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintPersonDetailsWithSortedName {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        Person.getPersonList(list);

        list
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList())
                .forEach(p -> System.out.println(p.getId() + ", " + p.getName()));
    }
}