package com.krit.part03;

public class Knight extends Earthling {

  public Knight() {
    super();
    this.kind = Kind.HUMAN;
  }

  @Override
  public void move() {
    System.out.println("Move move..");
  }

  @Override
  public void attack() {
    System.out.println("For the King.. Attack..");
  }

  // //Cannot override the final method
  // public void stand() {
  // System.out.println("Knight Stand Still...");
  // }
}
