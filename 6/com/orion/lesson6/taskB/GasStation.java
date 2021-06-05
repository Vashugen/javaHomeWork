package com.orion.lesson6.taskB;

public class GasStation {

    private String address;
    private GasolineType gasolineType;
    private Double price;

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

    public GasStation(String address, GasolineType gasolineType, Double price) {
        this.address = address;
        this.gasolineType = gasolineType;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GasolineType getGasolineType() {
        return gasolineType;
    }

    public void setGasolineType(GasolineType gasolineType) {
        this.gasolineType = gasolineType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
