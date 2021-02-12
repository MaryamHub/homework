package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ann Petrova", "Doctor", "ann@mail.ru", "+7 700800",
                2500, 25);
        employees[1] = new Employee("Alexey Smirnov", "Director", "alexey@mail.ru", "+7 900100",
                3000, 30);
        employees[2] = new Employee("Alexandr Belov", "Manager1", "alexandr@mail.ru", "+7 500400",
                2000, 46);
        employees[3] = new Employee("Kate Ivanova", "Manager2", "alex@mail.ru", "+7 600300",
                1500, 32);
        employees[4] = new Employee("Ivan Novikov", "Driver", "alex@mail.ru", "+7 400700",
                1250.5f, 42);

        final int needAge = 40;

        for (Employee employee : employees) {
            if (employee.getAge() > needAge) {
                System.out.println(employee.toString());
            }
        }
    }
}
