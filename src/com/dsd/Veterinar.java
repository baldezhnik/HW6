package com.dsd;

public class Veterinar {

    public void treatAnimal (InterfaceAnimal intAnim){
        intAnim.eat();
    }

    public void makeNoise (InterfaceAnimal intAnim){
        intAnim.makeNoise();
    }

    public void sleep (InterfaceAnimal intAnim){
        intAnim.sleep();
    }

    public void uniq (InterfaceAnimal intAnim){
        intAnim.uniq();
    }
}
