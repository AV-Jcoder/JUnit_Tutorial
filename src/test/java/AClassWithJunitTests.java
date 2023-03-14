import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AClassWithJunitTests {

    static int i;
    static int j;

    @BeforeAll
    static void setUp() {
        i = 0;
        j = 0;
    }

    @Test
    @DisplayName("First dumb test")
    void demoTestMethodI() {
        assertTrue(i < 1, "This message newer will display.");
    }

    @RepeatedTest(3)
    @DisplayName("Second dumb test")
    void demoTestMethodJ() {
        assertFalse(j++ > 1, "This message will display, when test fail.");
    }
}
