import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AClassWithDumbTests {

    static int i;
    static int j;

    @BeforeAll
    static void setUp() {
        i = 0;
        j = 0;
    }

    @Test
    @DisplayName("First dumb test.")
    void demoTestMethodI() {
        assertTrue(i < 1, "This message newer will display.");
    }

    @RepeatedTest(3)
    @DisplayName("Second dumb test.")
    void demoTestMethodJ() {
        assertFalse(j++ > 1, "This message will display, when test fail.");
    }

    @Test
    @DisplayName("Unconditional Error.")
    void testUnconditionalError() {
        fail("This test is newer pass.");
    }

    @Test
    @DisplayName("TimeOut test.")
    void testTimeOutAssertion() {
        assertTimeout(Duration.ofSeconds(2),() -> TimeUnit.SECONDS.sleep(10), "Time test fail. Too long executing.");
    }

    @Test
    @DisplayName("TimeOut test, abort preventive.")
    void testTimeOutAssertionPreventive() {
        assertTimeoutPreemptively(Duration.ofSeconds(5),() -> TimeUnit.SECONDS.sleep(10), "Time test fail. Too long executing.");
    }

    @Test
    @DisplayName("Tests all assertions.")
    void testsAllAssertion() {
        assertAll(
                () -> assertNotNull(null,"Fail, object is null"),
                () -> assertNotNull(new Object(),"Fail, object is null"),
                () -> assertNotNull(null,"Fail, object is null")
        );
    }

    @Test
    @Disabled
    @DisplayName("This test is disabled for many reason.")
    void hiddenTest(){
        assertNotEquals(1,4);
    }

}
