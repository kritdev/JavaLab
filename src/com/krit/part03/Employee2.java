package com.krit.part03;

public class Employee2 {
  public String firstname;
  public String lastname;
  private int salary;

  public Employee2() {
    this("Anonymous", "Anonymous", 9000);
  }

  public Employee2(String firstnameInput, String lastnameInput) {
    this(firstnameInput, lastnameInput, 9000);
  }

  public Employee2(String firstnameInput, String lastnameInput, int salaryInput) {
    this.firstname = firstnameInput;
    this.lastname = lastnameInput;
    this.salary = salaryInput;
  }

  public int getSalary() {
    return salary;
  }
}
