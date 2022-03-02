package com.company;

public class Tom extends Cat implements Moveable,Eat,Eatable {


      @Override
      public void eat () {
          System.out.println("Cat can eat mouse.");
      }
       @Override
       public void eatable () {
          System.out.println("Cat can eatable dog.");
        }
       @Override
       public void moveable () {
          System.out.println("Cat can run from dog.");
       }

}