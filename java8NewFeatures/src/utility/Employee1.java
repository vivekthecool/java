package utility;

import java.util.List;
import java.util.Objects;

public class Employee1 {
    Integer id;
    String name;
    Long salary;
    Integer age;

    public Employee1(Integer id, String name, Long salary, Integer age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    public Integer getAge() {
        return age;
    }

    public static void getEmployeeList(List<Employee1> list) {
        Employee1 arrObj = new Employee1(1, "naga", 2000l, 30);
        list.add(arrObj);

        arrObj = new Employee1(2, "ram", 3000l, 28);
        list.add(arrObj);

        arrObj = new Employee1(1, "naga", 2000l, 30);
        list.add(arrObj);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;

        return Objects.equals(id, employee1.id)
                && Objects.equals(name, employee1.name)
                && Objects.equals(salary, employee1.salary)
                && Objects.equals(age, employee1.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, age);
    }
}
