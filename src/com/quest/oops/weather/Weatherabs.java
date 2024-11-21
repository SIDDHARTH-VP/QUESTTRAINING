package com.quest.oops.weather;

public interface Weatherabs {
     void addCityWeather(String name, double temperature, int humidity, String condition);
     void displayAllCities();
     void displayCity(String name);
     void findExtremes();
     void displayHighHumidityCities();
     void displayCitiesByCondition();
     void calculateAverageTemperature();
     void displayAlerts();
}
