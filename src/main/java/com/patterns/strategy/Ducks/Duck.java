package com.patterns.strategy.Ducks;

import com.patterns.strategy.Fly.FlyBehavior;
import com.patterns.strategy.Quacks.QuackBehavior;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {}

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public FlyBehavior getFlyBehavior() {
    return flyBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public QuackBehavior getQuackBehavior() {
    return quackBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
