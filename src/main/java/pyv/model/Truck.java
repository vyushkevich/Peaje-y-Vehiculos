package pyv.model;

public class Truck extends Vehicle {

    public Truck(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public int calculateToll() {
        return 70; 
    }
}
