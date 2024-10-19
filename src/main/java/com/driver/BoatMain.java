package com.driver;

public class BoatMain {
    public static void main(String[] args) {
        Boat boat = new Boat("Sailboat", 6);
        System.out.println(boat.getVehicleName() + " has capacity: " + boat.getVehicleCapacity());
    }
}
