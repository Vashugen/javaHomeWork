package com.orion.lesson6.taskB;

import com.orion.lesson6.tuple.Triple;

import java.util.ArrayList;
import java.util.List;

public class TaskB {

    List <GasStation> gasStations = List.of(
            new GasStation ("Горького, 18", GasStation.GasolineType.AI92, 95.50),
            new GasStation ("Гагарина, 222", GasStation.GasolineType.DT, 94.50),
            new GasStation ("Рокоссовского, 10", GasStation.GasolineType.AI95, 96.00),
            new GasStation ("Минина, 1", GasStation.GasolineType.AI92, 94.00)
    );


    List<Triple<String,Integer,Double>> mobileAppList = List.of(
            new Triple<String,Integer,Double>("ShmugenGames", 5000, 5.0),
            new Triple<String,Integer,Double>("VashuNote", 25149, 4.69),
            new Triple<String,Integer,Double>("Another one app", 785, 3.25),
            new Triple<String,Integer,Double>("ShmugenGames", 127000, 4.0)
    );

    List<Triple<String, GasStation.GasolineType, Double>> gasStationList = new ArrayList<Triple<String,GasStation.GasolineType, Double>>();

    public TaskB() {

        gasStations.forEach(e -> {
            gasStationList.add(new Triple<String, GasStation.GasolineType, Double>(e.getAddress(), e.getGasolineType(), e.getPrice()));
        });

    }

    public static void findBestGasPrice(GasStation.GasolineType type){

        this.gasStationList.forEach();
        //System.out.println(this.gasStationList);

    }

    public static void main(String[] args) {


    }
}
