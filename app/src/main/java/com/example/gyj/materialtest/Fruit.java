package com.example.gyj.materialtest;

/**
 * Created by GYJ on 2019/4/2.
 */

public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getName(){
        return name;
    }
    public  int getImageId(){
        return imageId;
    }
}
