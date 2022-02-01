package ivan.ermolaev.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    void assertTrueTest() {
        Assertions.assertTrue(3 > 2);
    }

    @Test
    void assertFalseTest() {
        Assertions.assertTrue(1 > 2);
    }
}
