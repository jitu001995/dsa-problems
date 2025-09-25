package org.dsa.java8;

    import java.util.*;
import java.util.stream.*;

    class Department {
        private List<Employees> employeeList;

        public Department(List<Employees> employeeList) {
            this.employeeList = employeeList;
        }

        public List<Employees> getEmployeeList() {
            return employeeList;
        }
    }

    class Employees {
        private List<String> skills;

        public Employees(List<String> skills) {
            this.skills = skills;
        }

        public List<String> getSkills() {
            return skills;
        }
    }

    public class flatMap {
        public static void main(String[] args) {
            // Sample data
            Employees e1 = new Employees(Arrays.asList("Java", "Spring", "SQL"));
            Employees e2 = new Employees(Arrays.asList("Java", "React", "Docker"));
            Employees e3 = new Employees(Arrays.asList("Python", "Spring", "AWS"));

            Department d1 = new Department(Arrays.asList(e1, e2));
            Department d2 = new Department(Arrays.asList(e3));

            List<Department> departments = Arrays.asList(d1, d2);

            // Get unique skills
            Set<String> uniqueSkills = departments.stream()
                    .flatMap(dept -> dept.getEmployeeList().stream())  // flatten employees
                    .flatMap(emp -> emp.getSkills().stream())          // flatten skills
                    .collect(Collectors.toSet());                      // unique values

            System.out.println(uniqueSkills);
        }
    }


