package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    dp.addTakeaway();
    System.out.print(dp.getPrice());

  }
}