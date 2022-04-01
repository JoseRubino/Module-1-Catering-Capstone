package com.techelevator;

public class CateringItem {

    private double price;
    private String name;
    private int numOfCateringItems = 7;
    private String itemId;
    private String foodType;


    public CateringItem(String itemId, String name, String foodType, double price){
        this.name = name;
        this.price = price;
        this.itemId = itemId;
        this.foodType = foodType;
    }

    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;

    }
    public int getNumOfCateringItems(){
        return numOfCateringItems;
    }
    public boolean itemAvailable(){
        if(this.numOfCateringItems >=1){
            return true;
        }
        return false;
    }
    public int purchaseItem(int i){
        return numOfCateringItems -=1;
    }
    public String getQuantityString() {
        if (this.getNumOfCateringItems() == 0) {
            return "NO LONGER AVAILABLE";
        } else {
            return String.valueOf(this.getNumOfCateringItems());
        }
    }
        public String getItemId() {
            return itemId;
        }

        public void setItemId(String itemId) {
            this.itemId = itemId;
        }



        public String getFoodType() {
            return foodType;
            }

    public void setFoodType(String foodType){
        this.foodType = foodType;

    }
}
