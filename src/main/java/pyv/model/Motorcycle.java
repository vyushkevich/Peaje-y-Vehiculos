package pyv.model;

public class Motorcycle extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public int calculateToll() {
        return 80; 
    }
}
