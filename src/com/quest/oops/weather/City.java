package com.quest.oops.weather;

public class City {
    private String name;
    private double temperature;
    private int humidity;
    private String condition;
    public City(String name, double temperature, int humidity, String condition) {
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }
//all the getter and setter methods
    public String getName() {
        return name;
    }

    public void setCityName(String cityName) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + name + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", condition='" + condition + '\'' +
                '}';
    }
}
