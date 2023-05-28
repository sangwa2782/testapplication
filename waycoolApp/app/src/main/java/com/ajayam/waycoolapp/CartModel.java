package com.ajayam.waycoolapp;

public class CartModel {
    int img;
    String name,weight, quantity, price;

    public CartModel(int image,String weight, String price, String name, String quantity){
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
        this.img = image;
        this.price = price;
    }
}
