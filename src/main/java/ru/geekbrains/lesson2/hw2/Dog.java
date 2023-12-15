package ru.geekbrains.lesson2.hw2;

public class Dog extends Animal{
    boolean isPet;
    public Dog(String name, int age, boolean isPet) {
        super(name, age);
        this.isPet = isPet;
    }

    public void run() {
        System.out.println("Собака бегает.");
    }
    @Override
    public void makeSound() {
        System.out.println("Гав - гав!");
    }
}
