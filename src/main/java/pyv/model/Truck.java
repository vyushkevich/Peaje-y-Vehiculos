package pyv.model;

public class Truck extends Vehicle {
    private int numberOfAxles;

    public Truck(String licensePlate, int numberOfAxles) {
        super(licensePlate);
        this.numberOfAxles = numberOfAxles;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    @Override
    public int calculateToll() {
        return numberOfAxles * 50; 
    }
}
