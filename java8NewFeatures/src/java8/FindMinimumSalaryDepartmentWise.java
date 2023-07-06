package java8;

import utility.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class FindMinimumSalaryDepartmentWise {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee.getEmployeeList(list);

        Map<String, Employee> collect =
                list.stream().
                        collect(Collectors
                                .groupingBy(e -> e.getDepartment(),
                                        Collectors.collectingAndThen(
                                                Collectors.minBy(
                                                        Comparator.comparingDouble(e -> e.getSalary())),
                                                Optional::get)));

        for (Map.Entry<String, Employee> map : collect.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue().getSalary());
        }
    }


}
