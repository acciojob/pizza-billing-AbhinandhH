package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza p = new DeluxePizza(false);
    p.addTakeaway();
    p.addExtraCheese();
    p.addExtraCheese();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}