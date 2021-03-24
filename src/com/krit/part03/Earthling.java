package com.krit.part03;

abstract class Earthling {
  public int i = 1;

  public final String nationality = "Earth";

  public abstract void move();

  public abstract void attack();

  // Remember : Non-abstract methods are also allowed
  public void stand() {
    System.out.println("Stand Still...");
  }
}
