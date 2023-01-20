package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addTakeaway();
    System.out.println(p.getBill());

    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getBill());

  }
}