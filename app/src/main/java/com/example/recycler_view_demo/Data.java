package com.example.recycler_view_demo;

import androidx.annotation.NonNull;

public class Data {
    String name,price;
    int img;

    @NonNull
    @Override
    public String toString() {
        return "Data: {" +
                "Name: "+name+
                ", Price: "+price+
                ", Image: "+img+" }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
