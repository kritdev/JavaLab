package com.krit.part02;

public class Lab03 {

  public static void main(String[] args) {
    Employee[] employees = new Employee[5];

    for (int i = 0; i < employees.length; i++) {
      employees[i] = new Employee("name " + i, "lastname " + i, i * 10000);
    }

    for (int i = 0; i < employees.length; i++) {
      System.out.println(employees[i]);
    }

  }

}
