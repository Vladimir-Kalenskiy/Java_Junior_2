package ru.geekbrains.lesson2.hw2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;

public class Program {

    /*
    Создайте абстрактный класс "Animal" с полями "name" и "age".
    Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
    Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
    Выведите на экран информацию о каждом объекте.
     */

    public static void main(String[] args) {

        LinkedList<Animal> animals = new LinkedList<>();

        Animal dog = new Dog("Бобик", 2, false);
        Animal cat = new Сat("Басик", 3, true);

        animals.add(dog);
        animals.add(cat);

        for(Animal animal: animals) {
            Class<?> childAnimal = animal.getClass();
            Class<?> superAnimal = childAnimal.getSuperclass();

            System.out.println("\tРодительский класс: " + superAnimal + "." +
                    "\n \tКласс наследник: " + childAnimal);

            System.out.println("\tПоля родительского класса:");

            Field[] superFields = superAnimal.getDeclaredFields();
            for (Field field: superFields) {
                System.out.println(field);
            }

            System.out.println("\tПоля дочернего класса:");

            Field[] childFields = childAnimal.getDeclaredFields();
            for (Field field: childFields) {
                System.out.println(field);
            }

            System.out.println("\tМетоды родительского класса: ");

            Method[] superMethods = superAnimal.getDeclaredMethods();
            for(Method method: superMethods) {
                System.out.println(method);
            }

            System.out.println("\tМетоды родительского класса: ");

            Method[] childMethods = childAnimal.getDeclaredMethods();
            for(Method method: childMethods) {
                System.out.println(method);
            }

            animal.makeSound();

            System.out.println();
        }

    }
}
