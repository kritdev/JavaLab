package com.krit.part03;

public final class Godzilla extends Earthling {

  public Godzilla() {
    super();
    this.kind = Kind.ZILLANOID;
  }

  @Override
  public void move() {
    System.out.println("zee...");
  }

  @Override
  public void attack() {
    System.out.println("Gaaa Gaa....");
  }

}
