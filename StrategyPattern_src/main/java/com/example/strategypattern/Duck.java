package com.example.strategypattern;

/**
 * Created by Chinmaya on 9/23/2017.
 */

public abstract class Duck {


    Flyable flyable;
    Quackable quackable;
        public String swim(){
        return "I can swim";
    }
    abstract String display();
    public Duck(){

    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public String performFly(){
        return flyable.performFly();
    }
    public String performQuack(){
        return  quackable.performQuack();
    }
}
