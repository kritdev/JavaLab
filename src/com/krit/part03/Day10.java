package com.krit.part03;

public class Day10 {

  public static void main(String[] args) {
    Employee2 employee1 = new Employee2();
    System.out.println(employee1.firstname); // Anonymous
    System.out.println(employee1.lastname); // Anonymous
    System.out.println(employee1.getSalary()); // 9000

    Employee2 employee2 = new Employee2("Dang", "Red");
    System.out.println(employee2.firstname); // Dang
    System.out.println(employee2.lastname); // Red
    System.out.println(employee2.getSalary()); // 9000

    Employee2 employee3 = new Employee2("Dang", "Red", 20000);
    System.out.println(employee3.firstname); // Dang
    System.out.println(employee3.lastname); // Red
    System.out.println(employee3.getSalary()); // 20000
  }

}
