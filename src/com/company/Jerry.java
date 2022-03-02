package com.company;

public class Jerry extends Mouse implements Moveable,Eatable{
    @Override
    public void eatable () {
        System.out.println("Mouse can eatable dog and cat.");
    }
    @Override
    public void moveable () {
        System.out.println("Mouse can run from dog and cat.");
    }

}

