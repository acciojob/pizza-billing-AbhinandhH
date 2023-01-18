package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;


    private boolean isCheese;
    private boolean isToppings;
    private boolean isPaperbag;
    private int basePizzaPrice;
    private int cheesePrice = 80;
    private int bagPrice = 20;
    private int toppingPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";
        if(isVeg) {
            this.price = 300;
            basePizzaPrice = 300;
            toppingPrice = 70;
        }
        else {
            this.price = 400;
            basePizzaPrice = 400;
            toppingPrice = 120;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if(!isCheese) {
            this.isCheese = true;
            this.price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        if(!isToppings) {
            price += toppingPrice;
            isToppings = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperbag) {
            isPaperbag = true;
            price += bagPrice;
        }
    }

    public String getBill(){
        bill += "Base Price Of The Pizza: " + basePizzaPrice + "\n";
        if(isCheese) bill += "Extra Cheese Added: " + cheesePrice + "\n";
        if(isToppings) bill += "Extra Toppings Added: " + toppingPrice + "\n";
        if(isPaperbag) bill += "Paperbag Added: " + bagPrice + "\n";
        bill += "Total Price: " + getPrice();

        return this.bill;
    }
}