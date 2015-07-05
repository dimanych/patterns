package com.patterns.strategy;

import com.patterns.strategy.Ducks.Duck;
import com.patterns.strategy.Ducks.MallardDuck;
import com.patterns.strategy.Ducks.ModelDuck;
import com.patterns.strategy.Fly.FlyRocketPowered;

class Hello {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
