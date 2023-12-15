package ru.geekbrains.lesson2.hw2;

public class Сat extends Animal{

    boolean isSterilization;
    public Сat(String name, int age, boolean isSterilization) {
        super(name, age);
        this.isSterilization = isSterilization;
    }

    public void sleep() {
        System.out.println("Кот спит.");
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу - мяу!");
    }
}
