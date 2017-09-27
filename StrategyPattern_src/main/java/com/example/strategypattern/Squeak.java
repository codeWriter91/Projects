package com.example.strategypattern;

/**
 * Created by Chinmaya on 9/24/2017.
 */

public class Squeak implements Quackable {
    @Override
    public String performQuack() {
        return "Squeeeaak";
    }
}
