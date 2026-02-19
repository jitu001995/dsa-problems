package org.dsa.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Top3_ByDept {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Jitender", 21,"IT", 90000.00),
                new Employee(2, "Amit", 22,"IT", 80000.00),
                new Employee(3, "Rahul", 23,"IT", 95000.00),
                new Employee(4, "Neha", 24,"HR", 70000.00),
                new Employee(5, "Priya", 25, "HR", 75000.00),
                new Employee(6, "Ankit", 26,"HR", 72000.00),
                new Employee(7, "Suresh", 27,"Finance", 85000.00),
                new Employee(8, "Kiran", 28, "Finance", 83000.00),
                new Employee(9, "Ravi", 29,"Finance", 88000.00)
        );

        Map<String, List<Employee>> top3ByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                .limit(3)
                                                .collect(Collectors.toList())
                                )
                        ));


        employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list->list.stream()
                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                .limit(3)
                                .collect(Collectors.toList())
                )
        ));
        top3ByDept.forEach((dept, empList) -> {
            System.out.println(dept + " -> " + empList);
        });



    }
}
