package com.quest.casestudy6dec.vehicle;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class VehicleImpl {

    public static Vehicle[] addVehicle() {
        Vehicle[] inventory=new Vehicle[5];

        inventory[0] = new Car("C123","Toyota","Supra",20000.00, LocalDate.of(2022,5,15),2);
        inventory[1] = new Car("C124", "Honda", "NSX", 22000.00, LocalDate.of(2021, 8, 2), 3);
        inventory[2] = new Car("C125", "Honda", "Civic", 21000.00, LocalDate.of(2023, 2, 5), 5);
        inventory[3] = new Bike("B456", "Yamaha", "R15", 1500.00, LocalDate.of(2023, 3, 10), 155);
        inventory[4] = new Bike("B457", "Royal Enfield", "Classic 350", 2000.00, LocalDate.of(2022, 6, 20), 350);

        return inventory;
    }

    public static void printVehiclesByBrand(Vehicle[] inventory, String brand) {
        List<Vehicle> vehicles = Arrays.stream(inventory)
                .filter(vehicle -> vehicle!=null && vehicle.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());

        System.out.println("Vehicles of brand " + brand + ":");
        vehicles.forEach(System.out::println);
    }

    public static void purchaseVehicle(Vehicle[] inventory, Customer customer, Map<Customer, Set<Vehicle>> customerVehicleMap, String vehicleId) throws VehicleNotAvailableException {
        Vehicle vehicleToPurchase = null;

        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null && inventory[i].getVehicleId().equals(vehicleId)) {
                vehicleToPurchase = inventory[i];
                inventory[i] = null;
                break;
            }
        }
        if (vehicleToPurchase == null) {
        throw new VehicleNotAvailableException("Vehicle " + vehicleId + " not available");
        }
        customer.addPurchasedVehicles(vehicleToPurchase);
        customerVehicleMap.computeIfAbsent(customer, k -> new HashSet<>()).add(vehicleToPurchase);
    }

}
