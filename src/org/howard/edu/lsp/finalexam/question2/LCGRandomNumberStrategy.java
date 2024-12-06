package org.howard.edu.lsp.finalexam.question2;

/**
 * Random number generator using Linear Congruential Generator (LCG) algorithm.
 */
public class LCGRandomNumberStrategy implements RandomNumberStrategy {

    private long seed;

    public LCGRandomNumberStrategy(long seed) {
        this.seed = seed;
    }

    @Override
    public int generateRandomNumber() {
        seed = (seed * 1664525L + 1013904223L) & 0xFFFFFFFF;
        return (int)(seed % 100) + 1; // returns a number between 1 and 100
    }
}
