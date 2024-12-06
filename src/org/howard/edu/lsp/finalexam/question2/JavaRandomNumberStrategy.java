package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Random number generator using Java's built-in Random.
 */
public class JavaRandomNumberStrategy implements RandomNumberStrategy {

    private Random random;

    public JavaRandomNumberStrategy() {
        random = new Random();
    }

    @Override
    public int generateRandomNumber() {
        return random.nextInt(100) + 1; // returns a number between 1 and 100
    }
}
