package pyv.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCalculateToll() {
        Vehicle car = new Car("ABC123");
        assertEquals(100, car.calculateToll());
    }
}
