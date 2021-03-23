package com.krit.part03;

public class Employee {
  public String firstname;
  public String lastname;
  private int salary;

  public String position;

  public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
    this.firstname = firstnameInput;
    this.lastname = lastnameInput;
    this.salary = salaryInput;
    this.position = "Stuff";
  }

  public Employee(String firstname, String lastname, int salary, String position) {
    this(firstname, lastname, salary);
    this.position = position;
  }

  public static void main(String[] args) {
    Employee employee = new Employee("Mike", "Yello", 20000, "Messenger");
    employee.checkPosition();
  }

  public void hello() {
    System.out.println("Hello " + this.firstname);
  }

  public int getSalary() {
    return salary;
  }

  public void checkPosition() {
    System.out.println("My Position is " + position);
  }
}
