package com.lannstark.lec12;

import com.kimjingyu.lec12.Person;

public class Lec12Main {

  public static void main(String[] args) {
    Person user = Person.newBaby("user");
//    Person user = Person.Factory.newBaby("user");
    System.out.println("user = " + user);

    moveSomething(new Movable() {
      @Override
      public void move() {
        System.out.println("움직이기!!");
      }

      @Override
      public void fly() {
        System.out.println("날기!!");
      }
    });

  }

  private static void moveSomething(Movable movable) {
    movable.move();
    movable.fly();
  }
}
