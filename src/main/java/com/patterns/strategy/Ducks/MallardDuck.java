package com.patterns.strategy.Ducks;

import com.patterns.strategy.Fly.FlyWithWings;
import com.patterns.strategy.Quacks.Quack;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("Я настоящий Mallrd Duck");
  }
}
