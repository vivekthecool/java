package java8;

import utility.Employee1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayObject {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        Employee1.getEmployeeList(list);

        list
                .stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(s ->
                        System.out.println(s.getId() + ", " + s.getName() + ", " + s.getSalary() + ", " + s.getAge()));
    }
}
