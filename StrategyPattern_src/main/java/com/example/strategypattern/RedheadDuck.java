package com.example.strategypattern;

/**
 * Created by Chinmaya on 9/23/2017.
 */

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyable = new FlyNoWay();
        quackable = new Squeak();
    }

    @Override
    String display() {

        return "I'm a RedHead Duck!";
    }
}
