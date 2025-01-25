package pyv.model;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private String city;
    
    private int totalToll;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalToll = 0;
        this.vehicles = new ArrayList<>();
    }

    public void registerVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        totalToll += vehicle.calculateToll();
    }

    public int getTotalToll() {
        return totalToll;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
