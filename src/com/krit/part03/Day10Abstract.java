package com.krit.part03;

public class Day10Abstract {

  public static void main(String[] args) {
    Knight knight = new Knight();
    Godzilla godzilla = new Godzilla();

    System.out.println("--- Knight ---");
    knight.stand();
    knight.move();
    knight.attack();

    System.out.println("\n--- Godzilla ---");
    godzilla.stand();
    godzilla.move();
    godzilla.attack();

    // Test final variable
    // knight.nationality = "Thai"; // Error: final property cannot be assigned.
  }

}
