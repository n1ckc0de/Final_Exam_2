
package org.howard.edu.lsp.finalexam.question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    // Test for factorial method
    @Test
    public void testFactorial_Zero() {
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorial_PositiveNumber() {
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    public void testFactorial_NegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    // Test for isPrime method
    @Test
    public void testIsPrime_PrimeNumber() {
        assertTrue(mathUtils.isPrime(7), "7 should be a prime number");
    }

    @Test
    public void testIsPrime_NotPrime() {
        assertFalse(mathUtils.isPrime(4), "4 should not be a prime number");
    }

    @Test
    public void testIsPrime_LessThanOrEqualToOne() {
        assertFalse(mathUtils.isPrime(1), "1 should not be considered a prime number");
        assertFalse(mathUtils.isPrime(0), "0 should not be considered a prime number");
    }

    // Test for gcd method
    @Test
    public void testGcd_NonZeroNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
    }

    @Test
    public void testGcd_OneZeroInput() {
        assertEquals(5, mathUtils.gcd(5, 0), "GCD of 5 and 0 should be 5");
    }

    @Test
    public void testGcd_BothZeroInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        });
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }
}
