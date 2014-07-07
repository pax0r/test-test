package test;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Bartłomiej Biernacki on 07.07.14.
 */
public class UberFirstTestCase {
    @Test
    public void testPassed() {
        assertTrue(true);
    }

    @Test
    public void testFailed() {
        assertTrue(false);
    }

    @Test
    @Ignore
    public void skippedTest() {
        assertFalse(true);
    }
}
