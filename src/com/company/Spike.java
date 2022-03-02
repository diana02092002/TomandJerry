package com.company;

public class Spike extends Dog implements Moveable,Eat{
    @Override
    public void eat () {
        System.out.println("Dog can eat mouse and cat.");
    }
    @Override
    public void moveable () {
        System.out.println("Dog can run after mouse and cat.");
    }

}

