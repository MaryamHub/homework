package ru.geekbrains;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Сотрудник {" +
                "Полное имя: " + fullName + '\'' +
                ", Должность: " + position + '\'' +
                ", Почта: " + email + '\'' +
                ", Телефон: " + phone + '\'' +
                ", Зарплата: " + salary +
                ", Возраст: " + age +
                '}';
    }
}
