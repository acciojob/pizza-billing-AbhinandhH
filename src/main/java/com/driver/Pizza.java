package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill = "";
    private boolean isExtraCheese;
    private boolean isExtraTopping;
    private boolean isTakeAway;
    private int cheese;
    private int topping;
    private int bag;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        cheese = 80;
        bag = 20;
        if(isVeg){
            this.price = 300;
            this.topping = 70;
        }else{
            this.price = 400;
            this.topping = 120;
        }
        bill += "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if(!isExtraCheese){
            this.price += this.cheese;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraTopping){
            this.price += this.topping;
            isExtraTopping = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAway){
            this.price += this.bag;
            isTakeAway = true;
        }
    }

    public String getBill(){
        if(isExtraCheese){
            bill += "Extra Cheese Added: " + this.cheese + "\n";
        }
        if(isExtraTopping){
            bill += "Extra Toppings Added: " + this.topping + "\n";
        }
        if(isTakeAway){
            bill += "Paperbag Added: " + this.bag + "\n";
        }
        bill += "Total Price: " + this.price + "\n";

        return bill;
    }
}