package com.patterns.strategy.Quacks;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
