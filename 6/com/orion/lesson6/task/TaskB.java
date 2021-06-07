package com.orion.lesson6.task;

import com.orion.lesson6.tuple.Triple;

import java.util.List;

public class TaskB implements Task{

    public List<Triple<String, GasolineType, Double>> dataList;

    public static enum GasolineType {
        DT("ДТ"),
        AI92("АИ-92"),
        AI95("АИ-95"),
        AI98("АИ-98");

        private final String name;

        GasolineType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    @Override
    public void initData() {
        dataList = List.of(
                new Triple<String, GasolineType, Double>("Горького, 18", GasolineType.AI92, 95.50),
                new Triple<String, GasolineType, Double>("Гагарина, 222", GasolineType.DT, 94.50),
                new Triple<String, GasolineType, Double>("Рокоссовского, 10", GasolineType.AI95, 96.00),
                new Triple<String, GasolineType, Double>("Минина, 1", GasolineType.AI92, 94.00));
    }

    @Override
    public void printData() {
        dataList.forEach(e -> System.out.println(String.format("По адресу %s продаётся %s за %s", e.getFirst(), e.getSecond(), e.getThird())));
    }

    @Override
    public void actionTask() {

    }


    public static void findBestGasPrice(GasolineType type) {


        //use iterator?

    }

}
