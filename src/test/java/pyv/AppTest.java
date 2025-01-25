package pyv;

import org.junit.jupiter.api.Test;
import java.io.*;
/**
 * Unit test for simple App.
 */
class AppTest {

    @Test
    void testAppRunsTollControllerStart() throws IOException {
        // Redirect System.out to capture the output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Simulate input (e.g., register car, then exit)
        String input = "1\nABC123\n4\n"; // Option 1 -> Register car -> Exit
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Run the app
        App.main(new String[0]);
    }
}
