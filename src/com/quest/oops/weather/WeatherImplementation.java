package com.quest.oops.weather;

public class WeatherImplementation implements Weatherabs{

    private City[] citiesarray;
    private int cityCount;

    public WeatherImplementation(int capacity) {
        this.citiesarray = new City[capacity];
        this.cityCount = 0;
    }

    @Override
    public void addCityWeather(String name, double temperature, int humidity, String condition) {
        if(cityCount < citiesarray.length) {
            citiesarray[cityCount] = new City(name, temperature, humidity, condition);
            cityCount++;
            System.out.println("City added"+name);
        }else{
            System.out.println("Cant add more city");
        }

    }

    @Override
    public void displayAllCities() {
        System.out.println("Displaying All Cities:");
        for (int i = 0; i < cityCount; i++) {
            System.out.println(citiesarray[i]);
        }
    }

    @Override
    public void displayCity(String name) {
        for (int i = 0; i < cityCount; i++) {
            if (citiesarray[i].getName().equalsIgnoreCase(name)) {
                System.out.println(citiesarray[i]);
                return;
            }
        }
        System.out.println("City not found: " + name);
    }

    @Override
    public void findExtremes() {
        if (cityCount == 0) {
            System.out.println("No data available.");
            return;
        }
        City highest = citiesarray[0];
        City lowest = citiesarray[0];
        for (int i = 1; i < cityCount; i++) {
                if (citiesarray[i].getTemperature() > highest.getTemperature()) {
                    highest = citiesarray[i];
                }
                if (citiesarray[i].getTemperature() < lowest.getTemperature()) {
                    lowest = citiesarray[i];
                }
            }

        System.out.println("City with the Highest Temperature: " + highest);
        System.out.println("City with the Lowest Temperature: " + lowest);

    }

    @Override
    public void displayHighHumidityCities() {
        System.out.println("Cities with Humidity > 80%:");
        boolean found = false;
        for (int i = 0; i < cityCount; i++) {
            if (citiesarray[i].getHumidity() > 80) {
                System.out.println(citiesarray[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cities found.");
        }

    }

    @Override
    public void displayCitiesByCondition() {
        System.out.println("Cities by condition:");
        for(String condion:new String[]{"Sunny","Rainy"}){
            System.out.println(condion);
            boolean found = false;
            for (int i = 0; i < cityCount; i++) {
                if (citiesarray[i].getCondition().equalsIgnoreCase(condion)) {
                    System.out.println(citiesarray[i].getName());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No cities found.");
            }
        }
    }

    @Override
    public void calculateAverageTemperature() {
        if (cityCount == 0) {
            System.out.println("No data available.");
            return;
        }
        double totalTemperature = 0;
        double avgtemp=0;
        for (int i = 0; i < cityCount; i++) {
            totalTemperature += citiesarray[i].getTemperature();
        }
        avgtemp=totalTemperature/(cityCount);
        System.out.println("Average Temperature: "+avgtemp );

    }

    @Override
    public void displayAlerts() {
        System.out.println("Alerts:");
        for (int i = 0; i < cityCount; i++) {
            if (citiesarray[i].getTemperature() > 40) {
                System.out.println("Heatwave Alert: " + citiesarray[i].getName() + " is experiencing extreme heat " + citiesarray[i].getTemperature() + "°C");
            }
            else if (citiesarray[i].getHumidity() < 20) {
                System.out.println("Low Humidity Warning: " + citiesarray[i].getName() + " has very low humidity " + citiesarray[i].getHumidity());
            }
        }
    }


}
