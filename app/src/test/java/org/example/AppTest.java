package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void testFlipCoinSmallNumbers() {
        App classUnderTest = new App();
        String result = classUnderTest.flipCoin(10, 10);
        assertNotNull(result, "Result should not be null for small numbers of steps and trials");
    }

    @Test
    void testFlipCoinLargeNumbers() {
        App classUnderTest = new App();
        String result = classUnderTest.flipCoin(1000, 1000);
        assertNotNull(result, "Result should not be null for large numbers of steps and trials");
    }

    @Test
    void testFlipCoinZeroSteps() {
        App classUnderTest = new App();
        String result = classUnderTest.flipCoin(0, 10);
        String expected = String.format("%-20d %-15d %-15d", 0, 10, 0);
        assertEquals(expected, result, "Result should match expected output for zero steps");
    }

    @Test
    void testFlipCoinZeroTrials() {
        App classUnderTest = new App();
        String result = classUnderTest.flipCoin(10, 0);
        String expected = String.format("%-20d %-15d %-15d", 0, 0, 0);
        assertEquals(expected, result, "Result should match expected output for zero trials");
    }
}
