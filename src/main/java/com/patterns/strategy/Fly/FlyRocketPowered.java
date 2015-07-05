package com.patterns.strategy.Fly;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class FlyRocketPowered implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Реактиный полет!!!");
  }
}
