package com.driver;

public class Main {
  public static void main(String[] args) {


    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addTakeaway();
    System.out.println(p.getBill());
  }
}