package com.example.strategypattern;

/**
 * Created by Chinmaya on 9/23/2017.
 */

public class FlyWithWings implements Flyable {
    MainActivity mainActivity;
    @Override
    public String performFly() {
        return "I can't fly";
    }
}
