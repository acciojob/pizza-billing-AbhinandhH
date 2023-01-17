package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private  boolean extraTopping;
    private boolean bag;
    private boolean extraCheese;

    private int toping;
    private int basePrice;

    public Pizza(Boolean isVeg){
        bill = "";
        this.isVeg = isVeg;
        if(isVeg){
            basePrice = 300;
            price = 300;
        }else{
            basePrice = 400;
            price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(extraCheese){
            return;
        }
        extraCheese = true;
        price += 80;
    }
    public void addExtraToppings(){
        if(extraTopping){
            return;
        }
        if(isVeg){
            price += 70;
            toping = 70;
        }else{
            toping = 120;
            price += 120;
        }
        extraTopping = true;
    }

    public void addTakeaway(){
        if(bag){
            return;
        }
        bag = true;
        price += 20;
    }

    public String getBill(){
        bill += "Base Price Of The Pizza: " + basePrice + "\n";
        if(extraCheese){
            bill += "Extra Cheese Added: 80\n";
        }if(extraTopping){
            bill += "Extra Toppings Added: " + toping + "\n";
        }if(bag){
            bill += "Paperbag Added: 20\n";
        }
        bill += "Total Price: "+price;
        return bill;
    }
}
