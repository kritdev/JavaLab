package com.krit.part03;

abstract class Earthling {
  public int i = 1;

  public final String nationality = "Earth";

  public Kind kind = Kind.UNKNOWN;

  public abstract void move();

  public abstract void attack();

  // Remember : Non-abstract methods are also allowed
  public final void stand() {
    System.out.println("Stand Still...");
  }

  public void printKind() {
    System.out.print("I am ");
    switch (kind) {
      case HUMAN:
        System.out.println("Human.");
        break;
      case ANIMAL:
        System.out.println("Animal.");
        break;
      case ANDROID:
        System.out.println("Android.");
        break;
      case ZILLANOID:
        System.out.println("Zillanoid.");
        break;
      default:
        System.out.println("Unknown kind.");
    }
  }
}


enum Kind {
  UNKNOWN, HUMAN, ANIMAL, ANDROID, ZILLANOID
}
