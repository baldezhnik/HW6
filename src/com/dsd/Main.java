package com.dsd;

public class Main {

    public static void main(String[] args) {

        System.out.println("\tHomeWork");
        Veterinar vet = new Veterinar();

        InterfaceAnimal[] intAn = new InterfaceAnimal[3];
        intAn[0] = new Dog("кость","будка",true);
        intAn[1] = new Cat("мышь","дом", false);
        intAn[2] = new Horse("сено", "хлев", true);

        System.out.println("Отправляем к ветеринару");
        for (int i=0; i<3; i++){
            vet.treatAnimal(intAn[i]);
        }
        System.out.println("\nКоманда: ГОЛОС");
        for (int i=0; i<3; i++){
             vet.makeNoise(intAn[i]);
        }
        System.out.println("\nНаступила ночь");
        for (int i=0; i<3; i++){
            vet.sleep(intAn[i]);
        }
        System.out.println("\nНемного из мира животных");
        for (int i=0; i<3; i++){
            vet.uniq(intAn[i]);
        }
        System.out.println("\n\tMade by Dmitry Drako (─‿‿─)");
    }
}
