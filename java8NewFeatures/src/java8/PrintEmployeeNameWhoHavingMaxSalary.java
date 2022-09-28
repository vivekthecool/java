package java8;

import utility.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEmployeeNameWhoHavingMaxSalary {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee.getEmployeeList(list);

        double salary = list.stream()
                .max(Comparator.comparingDouble(Employee::getSalary)).get().getSalary();
        String name = list.stream()
                .filter(e -> e.getSalary() == salary)
                .map(Employee::getName)
                .distinct()
                .collect(Collectors.toList())
                .toString();
        System.out.println(name);
    }
}
