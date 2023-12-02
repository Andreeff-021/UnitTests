package homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    void evenOddNumber() {
        assertTrue(mainHW.evenOddNumber(2));
        assertFalse(mainHW.evenOddNumber(1));
    }

    @Test
    void numberInInterval() {
        assertTrue(mainHW.numberInInterval(50));
        assertFalse(mainHW.numberInInterval(10));
    }
}