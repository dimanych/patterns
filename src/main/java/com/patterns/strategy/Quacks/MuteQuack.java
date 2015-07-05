package com.patterns.strategy.Quacks;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("...Тишина... ");
  }
}
