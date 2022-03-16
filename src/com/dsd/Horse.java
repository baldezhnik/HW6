package com.dsd;

public class Horse extends Animal{

    private boolean kop;    // подкованная лошадь или нет

    public Horse (String food, String location, boolean kop){
        super(food, location, "Лошадь");
        this.kop=kop;
    }

    public void uniq(){
        String result = (this.kop) ? "Лошадь подкована":"Лошадь не подкована";
        System.out.println(result);
    }

    @Override
    public void makeNoise() {
        System.out.println("Конь ржет над моей зарплатой");

    }

    @Override
    public void eat() {
        System.out.printf("Лошадь ест %s\n", this.food);

    }

    @Override
    public void sleep() {
        System.out.printf("Лошадь спит в %s\n", this.location);

    }
}
