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
            this.basePizzaPrice = 300;
            this.toppingPrice = 70;
        }
        else {
            this.price = 400;
            this.basePizzaPrice = 400;
            this.toppingPrice = 120;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        if(!this.isCheese) {
            this.isCheese = true;
            this.price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        if(!this.isToppings) {
            this.price += this.toppingPrice;
            this.isToppings = true;
        }
    }

    public void addTakeaway(){
        if(!this.isPaperbag) {
            this.isPaperbag = true;
            this.price += this.bagPrice;
        }
    }

    public String getBill(){
        this.bill += "Base Price Of The Pizza: " + this.basePizzaPrice + "\n";
        if(this.isCheese) this.bill += "Extra Cheese Added: " + this.cheesePrice + "\n";
        if(isToppings) this.bill += "Extra Toppings Added: " + this.toppingPrice + "\n";
        if(isPaperbag) this.bill += "Paperbag Added: " + this.bagPrice + "\n";
        this.bill += "Total Price: " + this.getPrice();

        return this.bill;
    }
}