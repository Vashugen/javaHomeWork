package com.orion.lesson6.taskB;

import com.orion.lesson6.tuple.Triple;

import java.util.List;

public class TaskB {

    public enum GasolineType {
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

    List<Triple<String, GasolineType, Double>> gasStationList = List.of(
            new Triple<String, GasolineType, Double>("Горького, 18", GasolineType.AI92, 95.50),
            new Triple<String, GasolineType, Double>("Гагарина, 222", GasolineType.DT, 94.50),
            new Triple<String, GasolineType, Double>("Рокоссовского, 10", GasolineType.AI95, 96.00),
            new Triple<String, GasolineType, Double>("Минина, 1", GasolineType.AI92, 94.00)
    );

    List<Triple<String,Integer,Double>> mobileAppList = List.of(
            new Triple<String,Integer,Double>("ShmugenGames", 5000, 5.0),
            new Triple<String,Integer,Double>("VashuNote", 25149, 4.69),
            new Triple<String,Integer,Double>("Another one app", 785, 3.25),
            new Triple<String,Integer,Double>("ShmugenGames", 127000, 4.0),
    );

    public static void findBestPrice(GasolineType type){
        //sout адрес с наименьшей ценой на переданный тип бензина
    }
}
