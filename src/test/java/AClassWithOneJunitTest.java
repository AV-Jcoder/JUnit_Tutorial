import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AClassWithOneJunitTest {

    @Test
    @DisplayName("First dumb test")
    void demoTestMethod() {
        assertTrue(1<2, "This message will display, when test fail.");
    }

    @Test
    @DisplayName("Second dumb test")
    void demoTestMethod2() {
        assertFalse(1>2, "This message will display, when test fail.");
    }
}
