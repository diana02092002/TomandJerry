package com.company;

public abstract class Mouse implements Eatable,Moveable{
    String name;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void eatable(){
        System.out.println(" ");}
    @Override
    public void moveable(){
        System.out.println(" ");}
}

