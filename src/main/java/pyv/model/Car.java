package pyv.model;

public class Car extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public int calculateToll() {
        return 100; 
    }
}
