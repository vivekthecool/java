package utility;

import java.util.List;

public class Employee implements Comparable {
    private Integer id;
    private String name;
    private String department;
    private Double salary;

    public Employee(Integer id, String name, String department, Double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public static void getEmployeeList(List<Employee> list) {
        Employee employee = new Employee(1, "vivek", "cse", 1000d);
        list.add(employee);

        employee = new Employee(2, "vicky", "cse", 2000d);
        list.add(employee);

        employee = new Employee(3, "vivek1", "cse1", 2000d);
        list.add(employee);

        employee = new Employee(4, "vicky1", "cse1", 1000d);
        list.add(employee);

        employee = new Employee(5, "vivek2", "cse2", 2000d);
        list.add(employee);

        employee = new Employee(6, "vicky2", "cse2", 3000d);
        list.add(employee);

        list.add(new Employee(1, "vivek", "abc", 10000d));
        list.add(new Employee(2, "vivek1", "abc", 5000d));
        list.add(new Employee(3, "vivek2", "abc", 9000d));

        list.add(new Employee(1, "vivek", "abc1", 10000d));
        list.add(new Employee(1, "vicky", "abc1", 10000d));
        list.add(new Employee(2, "vivek1", "abc1", 5000d));
        list.add(new Employee(3, "vivek2", "abc1",  9000d));

        list.add(new Employee(1, "vivek", "abc2", 10000d));
        list.add(new Employee(2, "vivek1", "abc2", 5000d));
        list.add(new Employee(3, "vivek2", "abc2", 9000d));
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
