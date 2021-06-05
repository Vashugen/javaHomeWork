package com.orion.lesson6.taskA;

import com.orion.lesson6.tuple.Pair;

import java.util.List;
import java.util.Random;

public class TaskA {

    public List <Pair<Animal, String>> animalDish = List.of(
            new Pair<Animal, String>(new Animal(Animal.AnimalType.DOG.getName(), "Шарик"), "мясо"),
            new Pair<Animal, String>(new Animal(Animal.AnimalType.DOG.getName(), "Бобик"), "кости"),
            new Pair<Animal, String>(new Animal(Animal.AnimalType.HORSE.getName(), "Булат"), "морковь"),
            new Pair<Animal, String>(new Animal(Animal.AnimalType.RABBIT.getName(),"Королик"), "морковь"));


    public void feedAnimals(List<Pair<Animal, String>> list) {

        int rand = new Random().nextInt(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(String.format("Животное %s с радостью съедает %s", list.get(i).getFirst(), list.get(i).getSecond()));
            if(i == rand){
                System.out.println(String.format("Счастиливое животное %s получает двойную порцию %s", list.get(i).getFirst(), list.get(i).getSecond()));
            }
        }

    };
}
