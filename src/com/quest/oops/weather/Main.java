package com.quest.oops.weather;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //capacity finding
        System.out.println("Enter the maximum number of cities the system can handle:");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Weatherabs system = new WeatherImplementation(capacity);
        while (true) {
        System.out.println("\nWeather Monitoring System Menu:");
        System.out.println("1. Add City Weather");
        System.out.println("2. Display All Cities");
        System.out.println("3. Display City by Name");
        System.out.println("4. Find Extremes (Highest & Lowest Temperature)");
        System.out.println("5. Display Cities with Humidity > 80%");
        System.out.println("6. Group Cities by Condition");
        System.out.println("7. Calculate Average Temperature");
        System.out.println("8. Display Alerts");
        System.out.println("9. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

            switch (choice) {
                case 1:
                    addCityData(system, scanner);
                    break;
                case 2:
                    system.displayAllCities();
                    break;
                case 3:
                    System.out.print("Enter city name to display: ");
                    String cityName = scanner.nextLine();
                    system.displayCity(cityName);
                    break;
                case 4:
                    system.findExtremes();
                    break;
                case 5:
                    system.displayHighHumidityCities();
                    break;
                case 6:
                    system.displayCitiesByCondition();
                    break;
                case 7:
                    system.calculateAverageTemperature();
                    break;
                case 8:
                    system.displayAlerts();
                    break;
                case 9:
                    System.out.println("Exiting Weather Monitoring System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
//method to add city
    private static void addCityData(Weatherabs system, Scanner scanner) {
        System.out.print("Enter city name: ");
        String name = scanner.nextLine();
        System.out.print("Enter temperature (°C): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter humidity (%): ");
        int humidity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter weather condition (Sunny, Rainy, etc.): ");
        String condition = scanner.nextLine();
        system.addCityWeather(name, temperature, humidity, condition);
    }
}
