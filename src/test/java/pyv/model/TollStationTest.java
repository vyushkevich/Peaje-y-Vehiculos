package pyv.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TollStationTest {

    @Test
    void testRegisterVehicle() {
        TollStation station = new TollStation("Test Station", "Test City");
        Vehicle car = new Car("ABC123");
        station.registerVehicle(car);
        
        assertEquals(1, station.getVehicles().size());
        assertEquals(100, station.getTotalToll());
    }

    @Test
    void testGetTotalToll() {
        TollStation station = new TollStation("Test Station", "Test City");
        station.registerVehicle(new Car("ABC123"));
        station.registerVehicle(new Motorcycle("XYZ789"));
        
        assertEquals(150, station.getTotalToll());
    }
}
