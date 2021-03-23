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

    // 1. Create instance of class CEO and Employee
    System.out.print("\nCEO: ");
    CEO ceo = new CEO("John", "Black", 30000);
    System.out.print(ceo.firstname + " ");
    System.out.print(ceo.lastname + " ");
    System.out.print(ceo.getSalary() + "\n");

    System.out.print("\nEmployee: ");
    Employee employee4 = new Employee("Dodo", "Blue", 10000);
    System.out.print(employee4.firstname + " ");
    System.out.print(employee4.lastname + " ");
    System.out.print(employee4.getSalary() + "\n");

    // 2. Create Programmer
    Programmer programmer = new Programmer("Babo", "Green");
    System.out.print("\nProgrammer: ");
    System.out.print(programmer.firstname + " ");
    System.out.print(programmer.lastname + " ");
    System.out.print(programmer.getSalary() + "\n");
    programmer.installWindows("NT Server 4.0", "abcd1234567890");
  }

}
