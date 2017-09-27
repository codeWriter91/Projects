package com.example.strategypattern;

/**
 * Created by Chinmaya on 9/23/2017.
 */

public class FlyNoWay implements Flyable {
//    MainActivity mainActivity = new MainActivity();
    @Override
    public String performFly() {

//        mainActivity.text2.setText("I am flying");
        return "I am flying";
    }
}
