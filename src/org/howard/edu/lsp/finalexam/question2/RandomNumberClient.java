package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program that uses the RandomNumberService to generate random numbers
 * using different strategies.
 */
public class RandomNumberClient {

    public static void main(String[] args) {
        // Get the singleton instance of the RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // Use Java built-in Random strategy
        service.setStrategy(new JavaRandomNumberStrategy());
        System.out.println("Using Java Random: " + service.generateRandomNumber());

        // Use LCGRandomNumberStrategy
        service.setStrategy(new LCGRandomNumberStrategy(12345));
        System.out.println("Using LCG Random: " + service.generateRandomNumber());
    }
}
