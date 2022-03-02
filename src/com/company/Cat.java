package com.company;

public abstract class Cat implements Eat,Eatable,Moveable{
    String name;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void eat(){
        System.out.println(" ");}
    @Override
    public void eatable(){
        System.out.println(" ");}
    @Override
    public void moveable(){
        System.out.println(" ");}
}