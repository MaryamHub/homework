package ru.geekbrains.animals;

public class Main {
    public void main(String[] args) {

    Animal[] animals = {new Cat(), new Dog()};

    for (Animal animal : animals) {
        System.out.printf("%s run: %s\n",
            animal.getClass().getSimpleName(),
            animal.run(201));

        System.out.printf("%s swim: %s\n\n",
            animal.getClass().getSimpleName(),
            animal.swim(8));
        }

    Animal cat = new Cat();
    Animal dog = new Dog();

    assert !cat.run(201);
    assert cat.run(200);

    assert Dog.run(351) = true;
    assert Dog.run(560) = true;
    assert Dog.run(561) = false;
    }
}
