package java8;

import utility.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class PrintEmployeeNamesHavingSalaryMoreThan {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee.getEmployeeList(list);

        list.stream()
                .filter(e -> e.getSalary() > 5000d)
                .map(e -> e.getName())
                .distinct()
                .forEach(System.out::println);
    }


}
