package com.driver;


public class Pizza {

    private int price;

    private Boolean isVeg;
    private String bill;
    private  boolean extraTopping;
    private boolean bag;
    private boolean extraCheese;
    final private int basePrice;
    final private int extraCheesePrice = 80;
    final private int takeAway = 20;

    public Pizza(Boolean isVeg){
        bill = "";
        this.isVeg = isVeg;
        if(isVeg){
            price = 300;
        }else{
            price = 400;
        }
        basePrice = this.price;
    }

    final private int extraToppingPrice = isVeg ? 70 : 120;

    public int getPrice(){
        bill += price;
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheese){
            return;
        }
        extraCheese = true;
        price += extraCheesePrice;
    }
    public void addExtraToppings(){
        if(extraTopping){
            return;
        }
        price += extraToppingPrice;
        extraTopping = true;
    }

    public void addTakeaway(){
        if(bag){
            return;
        }
        price += takeAway;
        bag = true;
    }

    public String getBill(){

        bill += "Base Price Of The Pizza: " + this.basePrice + "\n";
        if(extraCheese){
            bill += "Extra Cheese Added: "+ this.extraCheesePrice +"\n";
        }if(extraTopping){
            bill += "Extra Toppings Added: " + this.extraToppingPrice + "\n";
        }if(bag){
            bill += "Paperbag Added: "+ this.takeAway +"\n";
        }
        bill += "Total Price: "+ this.price;

        return bill;
    }
}
