package pyv.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    void testCalculateToll() {
        Vehicle truck = new Truck("LMN456", 4);
        assertEquals(200, truck.calculateToll());
    }

    @Test
    void testGetNumberOfAxles() {
        Truck truck = new Truck("LMN456", 4);
        assertEquals(4, truck.getNumberOfAxles());
    }
}
