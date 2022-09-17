//package com.example.samples;
//
//import java.util.*;
//
//class EmployeeDetails {
//    List<Employee> employees;
//    public void setEmployees (List<Employee> employees) {
//        this.employees = employees;
//    }
//}
//
//class Employee implements Comparable {
//    String title;
//    String name;
//    Integer id;
//    Long salary;
//
//    @Override
//    public int compareTo(Object o) {
//        Employee e1 = (Employee) o;
//        return this.salary > e1.salary ? 1 :
//                (this.salary < e1.salary ? -1: 0);
//    }
//}
//
//public class JSONExtractor {
//    public static void main(String[] args) {
//        String str = "[{employeeName: \"Winter\",employeeCode: \"O0123\",employee: [{title: \"Mr.\", name: \"Tom\", id: 1005, salary: 12345},"
//            + "{title: \"Mr.\", name: \"Bunny\", id: 1009, salary: 54321},{title: \"Mr.\", name: \"Harris\", id: 1010, salary: 23456}]},{"
//            + "employeeName: \"Summer\",employeeCode: \"P10406\",employee: ["
//            + "{title: \"Mr.\", name: \"Seth\", id: 1006, salary: 1234},{title: \"Mr.\", name: \"Sam\", id: 1011, salary: 654321}]}]";
//
////        EmployeeDetails -> employeeName, employeeCode, employee (list of employee)
////        Employee -> title, name, id, salary
////        Employee name having max salary
//        List<Employee> emp = new ArrayList<>();
//
//        Employee emp1 = new Employee();
//        emp1.title = "Mr.";
//        emp1.name = "Tom";
//        emp1.id = 1005;
//        emp1.salary = 25345l;
//        emp.add(emp1);
//
//        emp1 = new Employee();
//        emp1.title = "Mr.";
//        emp1.name = "Bunny";
//        emp1.id = 1009;
//        emp1.salary = 54321l;
//        emp.add(emp1);
//
//        emp1 = new Employee();
//        emp1.title = "Mr.";
//        emp1.name = "Harris";
//        emp1.id = 1010;
//        emp1.salary = 23456l;
//        emp.add(emp1);
//
//        EmployeeDetails details = new EmployeeDetails();
//        details.employees = emp;
//        Optional<Employee> opt = details.employees.stream().sorted(Collections.reverseOrder()).findFirst();
//        if(opt.isPresent()) {
//            System.out.println(opt.get().name);
//        }
//    }
//}
//
////@RestController
////public class EmployeeController {
////
////    private EmployeeService service;
////
////    @GetMapping("/employees/")
////    public List<Employee> getEmployees() {
////        return service.extractAllEmployees();
////    }
////
////    @GetMapping("/")
////}
