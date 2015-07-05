package com.patterns.strategy.Fly;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Летать с помощью крыльев");
  }
}
