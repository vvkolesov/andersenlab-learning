package com.andersenlab.lecture4.homework4.animals;

public class Main {

    public static void main(String[] args) {

        //1. Создать классы Собака и Кот с наследованием от класса Животное.

        //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150);->'Бобик пробежал 150 м.');

        //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
        // плавание: кот не умеет плавать, собака 10 м.).

        //4. * Добавить подсчет созданных котов, собак и животных.
        Animal vasya = new Cat("Vasya", 150, 0);
        Animal tuzik = new Dog("Tuzik", 500, 10);

        vasya.swimming(200);
        vasya.running(100);
        vasya.running(1000);
        System.out.println();
        tuzik.running(500);
        tuzik.running(5000);
        tuzik.swimming(500);
        tuzik.swimming(5);

        System.out.println(
                "\nTotal cats created: " + Cat.getInstanceCounter() +
                "\nTotal dogs created: " + Dog.getInstanceCounter() +
                "\nTotal animals created: " + (Cat.getInstanceCounter() + Dog.getInstanceCounter()));
    }
}
