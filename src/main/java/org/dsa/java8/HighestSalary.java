package org.dsa.java8;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalary {
    public static void main(String[] args){
        List<Employee> empList = List.of(
                                       new Employee("jk",5,"d1",100.00),
                                       new Employee("jk1",5,"d1",101.00),
                                       new Employee("jk2",5,"d1",102.00),
                                       new Employee("bk",5,"d2",200.00),
                                       new Employee("bk1",5,"d2",201.00),
                                       new Employee("bk2",5,"d2",202.00),
                                       new Employee("sk",5,"d3",300.00),
                                        new Employee("sk1",5,"d3",301.00),
                                        new Employee("sk2",5,"d3",302.00)
                                          );

    Map<String, Optional<Employee>> empMap =    empList.stream()
                                       .collect(Collectors.groupingBy(Employee::getDepartment,
                                                                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

    System.out.println("Highest Salary by Dept :: "+empMap);


        Map<String, Employee> empMap1 = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get
                        )
                ));

        System.out.println("Emp Obj1 :: "+empMap1);
        Map<String,Employee> empMap2 = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                                                 Collectors.collectingAndThen(
                                                         Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                                                         ,Optional::get
                                                 )));

        System.out.println("Highest Salary by Dept2 :: "+empMap2);



        // find second Highest Salary
        Employee emp = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
      System.out.println("Second Highest Salary :: "+ emp);

      System.out.println("Using two Map ");
        Map<String, Employee> maps =empList.stream().collect(Collectors.toMap(
              Employee::getDepartment,
              e->e,
              (e1,e2)-> e1.getSalary() > e2.getSalary() ? e1:e2
      ));

        maps.forEach((k,v)-> System.out.println(k +" "+v.getSalary()));

      

    }



}
