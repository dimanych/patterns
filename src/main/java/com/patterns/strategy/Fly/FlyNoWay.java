package com.patterns.strategy.Fly;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Я не летаю!!");
  }
}
