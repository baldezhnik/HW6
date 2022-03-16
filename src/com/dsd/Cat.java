package com.dsd;

public class Cat extends Animal{

    private boolean sherst;   // гладили ли кота против шерсти)

    public Cat(String food, String location, boolean sherst) {
        super(food, location, "Кот");
        this.sherst=sherst;
    }

    public void uniq(){
        String result = (this.sherst) ? "Кота гладили против шерсти":"Кота не гладили против шерсти";
        System.out.println(result);
    }


    @Override
    public void makeNoise() {
        System.out.println("Кот мурлычет");

    }

    @Override
    public void eat() {
        System.out.printf("Кот ест %s\n", this.food);
    }

    @Override
    public void sleep() {
        System.out.printf("Кот спит в %s\n", this.location);

    }
}
