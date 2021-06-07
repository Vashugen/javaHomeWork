package com.orion.lesson6.task;

import com.orion.lesson6.tuple.Triple;

import java.util.List;

public class TaskC implements Task{

    public List<Triple<String, Integer, Double>> mobileList;

    @Override
    public void initData() {
        mobileList = List.of(
                new Triple<String, Integer, Double>("ShmugenGames", 5000, 5.0),
                new Triple<String, Integer, Double>("VashuNote", 25149, 4.69),
                new Triple<String, Integer, Double>("Another one app", 785, 3.25),
                new Triple<String, Integer, Double>("ShmugenGames", 127000, 4.0)
        );
    }

    @Override
    public void printData() {
        mobileList.forEach(e -> System.out.println(String.format("Приложение %s имеет %s оценок и средний балл %s", e.getFirst(), e.getSecond(), e.getThird())));
    }

    @Override
    public void actionTask() {
        System.out.println("Сортировка приложений по колву оценок");
        System.out.println("Приложение с самым лучшим рейтингом");
        System.out.println("Приложение с самым худшим рейтингом");
    }

    //private sortData(List<>)

}
