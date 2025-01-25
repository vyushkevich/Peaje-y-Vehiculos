package pyv.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void testCalculateToll() {
        Vehicle motorcycle = new Motorcycle("XYZ789");
        assertEquals(50, motorcycle.calculateToll());
    }
}
