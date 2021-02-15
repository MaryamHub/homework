package ru.geekbrains.animalsEat;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Cat4", 10),
                new Cat("Cat3", 15),
                new Cat("Cat2", 25),
                new Cat("Cat1", 5),
                new Cat("Cat", 1)
        };

        Plate plate = new Plate(30);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();
    }
}
