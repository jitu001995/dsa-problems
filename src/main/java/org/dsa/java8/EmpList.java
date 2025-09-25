package org.dsa.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpList {
    public static void main(String[] args){

        List<Employee> empList = Arrays.asList(
                new Employee("jitu",20,"it",100.00),
                new Employee("jitu1",25,"testing",101.00),
                new Employee("jitu2",26,"sales",103.00),
               new Employee("jitu3",27,"sales",104.00),
               new Employee("jitu4",28,"sales",105.00)
        );

        Map<String, Double> avgAgeByDept = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingInt(Employee::getAge)
                ));

        avgAgeByDept.forEach((dept, avg) ->
                System.out.println(dept + " -> " + avg)
        );
        System.out.println("Highest Salary Employee by Department:");

        Map<String, Optional<Employee>> highestEmpByDept = empList.stream().collect(
                                       Collectors.groupingBy(Employee::getDepartment,
                                               Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                                          ));
       highestEmpByDept.forEach((dept,emp)->System.out.println(dept +"->"+ emp.orElse(null)));

        System.out.println("Lowest Salary Employee by Department:");
       Map<String,Optional<Employee>> lowestEmpSalByDept = empList.stream().
                                                       collect(
                                                               Collectors.groupingBy(Employee::getDepartment,
                                                                       Collectors.minBy(
                                                                               Comparator.comparingDouble(Employee::getSalary)))
                                                       );

       lowestEmpSalByDept.forEach((dept,emp)->
               System.out.println( dept +"->"+ emp.orElse(null)));


        System.out.println("Averaging Salary Employee by Department:");
        Map<String,Double> mapDouble = empList.stream().collect(
                         Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary))
                       );
        System.out.println(mapDouble);

        Map<String,Double> mapDouble1 = empList.stream().collect(
                                Collectors.groupingBy(Employee::getDepartment,
                              Collectors.averagingDouble(Employee::getSalary))
                        );
        System.out.println(mapDouble1);

       String str = "pwkwed";

       Character ch = str.chars().mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                       .entrySet().stream()
                        .filter(c->c.getValue()==1)
                        .map(Map.Entry::getKey)
                       .findFirst()
                       .orElse(null);
      System.out.println("First non repeating character ::"+ch);



    Character ch1 =   str.chars().mapToObj(c->(char)c).collect(
                             Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())
                           ).entrySet().stream()
                              .filter(c->c.getValue()==1)
                               .map(Map.Entry::getKey).findFirst().orElse(null);

    System.out.println("Character :: "+ch1);


    }
}
