public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name; // Return the name of the boat
    }

    @Override
    public int getVehicleCapacity() {
        return capacity; // Return the capacity of the boat
    }
}


