package com.dsd;

public class Dog extends Animal{

    private boolean osh;  // имеется ли ошейник у собаки

    public Dog(String food, String location, boolean osh) {
        super(food, location, "Собака");
        this.osh=osh;
    }

    public void uniq(){
        String result = (this.osh) ? "Собака с ошейником":"Собака без ошейника";
        System.out.println(result);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cобака рычит");

    }

    @Override
    public void eat() {
        System.out.printf("Собака ест %s\n", this.food);

    }

    @Override
    public void sleep() {
        System.out.printf("Собака спит в %s\n", this.location);

    }
}
