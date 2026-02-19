package org.dsa.java8;
class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private Double salary;

    public Employee(String name, int age, String department,Double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public Employee(int id,String name, int age, String department,Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
