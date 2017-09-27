package com.example.strategypattern;

import android.content.Context;

/**
 * Created by Chinmaya on 9/23/2017.
 */

public class MallardDuck extends Duck {
    MainActivity mainActivity;
    Context context;
    public MallardDuck(){
        quackable = new Quack();
        flyable = new FlyWithWings();
    }


    @Override
    String display() {

        return "I am a Mallard Duck!";
    }
}
