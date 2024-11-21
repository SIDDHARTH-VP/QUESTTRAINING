package com.quest.oops.weather;

public abstract class Weatherabs {
    public abstract void addCityWeather(String name, double temperature, int humidity, String condition);
    public abstract void displayAllCities();
    public abstract void displayCity(String name);
    public abstract void findExtremes();
    public abstract void displayHighHumidityCities();
    public abstract void displayCitiesByCondition();
    public abstract void calculateAverageTemperature();
    public abstract void displayAlerts();
}
