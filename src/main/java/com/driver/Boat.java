package com.driver;

public class BoatMain implements WaterVehicle{
    private String name;
    private int capacity;

    public Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    @override
    public String getVehicleName(){
        return name;
    }
    @override
    public int getVehicleCapacity(){
        return capacity;
    }
}

public class Boat {
    public static void main(String[] args) {
        com.driver.Boat boat = new com.driver.Boat("Sailboat", 6);

        System.out.println(boat.getVehicleName() + " has capacity: " + boat.getVehicleCapacity());
    }
}
}
