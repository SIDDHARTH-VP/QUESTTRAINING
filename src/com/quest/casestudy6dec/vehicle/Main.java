package com.quest.casestudy6dec.vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
            Vehicle[] inventory=VehicleImpl.addVehicle();
            Customer customer = new Customer("CU001", "Sidd", "sid@gnmail.com");
            Map<Customer, Set<Vehicle>> customerVehiclesMap = new HashMap<>();

            VehicleImpl.printVehiclesByBrand(inventory,"Toyota");

            System.out.println("\nPurchased");
            try{
                VehicleImpl.purchaseVehicle(inventory,customer,customerVehiclesMap,"C123");
                VehicleImpl.purchaseVehicle(inventory,customer,customerVehiclesMap,"B456");

            }catch (VehicleNotAvailableException e){
                System.out.println(e.getMessage());
            }

        System.out.println("\n"+customer);
        System.out.println("\nCus Vehicle Map"+customerVehiclesMap);

        }
    }

