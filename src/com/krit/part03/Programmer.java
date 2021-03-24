package com.krit.part03;

public class Programmer extends Employee {
  public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
    super(firstnameInput, lastnameInput, salaryInput);
  }

  public Programmer(String firstnameInput, String lastnameInput) {
    this(firstnameInput, lastnameInput, 15000);
  }

  public void createWebsite(String template, String titleName) {
    System.out.println(
        firstname + " is creating website : " + titleName + ", with template : " + template + ".");
  }

  public void installWindows(String version, String productKey) {
    System.out.println(firstname + " is installing Windows : " + version + ", with product key : "
        + productKey + ".");
  }
}
