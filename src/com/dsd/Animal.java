package com.dsd;

public abstract class Animal implements InterfaceAnimal {

    protected String food;
    protected String location;
    protected String name;

    public Animal(String food, String location, String name){
        this.food=food;
        this.location=location;
        this.name=name;
    }

    abstract public void uniq();

    abstract public void makeNoise();

    abstract public void eat();

    abstract public void sleep();

}




