package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;


    private boolean isCheese = false;
    private boolean isToppings = false;
    private boolean isPaperbag = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        return;
    }

    public int getPrice(){
        return this.price;
    }

    //customer asks for extra cheese
    public void addExtraCheese() {
        if(!this.isCheese) {
            this.isCheese = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        if(!this.isToppings) {
            this.isToppings = true;
            if(isVeg) {
                this.price += 70;
            }
            else {
                this.price += 120;
            }
        }
        return;
    }

    public void addTakeaway(){
        if(!this.isPaperbag) {
            this.isPaperbag = true;
            this.price += 20;
        }
        return;
    }

    public String getBill(){
        this.bill = ("Base Price Of The Pizza: " + (isVeg?300:400)+
                "\nExtra Cheese Added: 80"  +
                "\nExtra Toppings Added: "  + (isVeg?70:120) +
                (isPaperbag?"\nPaperbag Added: 20":"") +
                "\nTotal Price: "+ this.price + "\n"
        );
        return this.bill;
    }
}