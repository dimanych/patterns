package com.patterns.strategy.Ducks;

import com.patterns.strategy.Fly.FlyNoWay;
import com.patterns.strategy.Quacks.Quack;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("Я утка-приманка");
  }
}
