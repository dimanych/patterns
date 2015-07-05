package com.patterns.strategy.Quacks;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Quack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Квак");
  }
}
