package ru.geekbrains.lesson8;

public class Wall extends Barrier {

    private int height;

    public Wall(String name, int height) {
        super(name);

        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена " + super.getName() + "высота: " + this.height);

        actions.jump();

        if (getHeight() <= actions.getJumpHeight()) {
            System.out.println("Прынул успешно!");

            return true;
        } else {
            System.out.println("Не смог прыгнуть!");

            return false;
        }
    }
}
