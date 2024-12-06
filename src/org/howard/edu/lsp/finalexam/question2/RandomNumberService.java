package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton class that provides random number generation services.
 */
public class RandomNumberService {

    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    private RandomNumberService() {
        // Default to built-in Random implementation
        strategy = new JavaRandomNumberStrategy();
    }

    /**
     * Get the singleton instance of the RandomNumberService.
     * @return instance of RandomNumberService
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Set the strategy for random number generation.
     * @param strategy the strategy to use for random number generation
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number based on the current strategy.
     * @return a positive integer random number
     */
    public int generateRandomNumber() {
        return strategy.generateRandomNumber();
    }
}
