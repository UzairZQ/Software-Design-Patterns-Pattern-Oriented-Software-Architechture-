package Behavioral.StrategyPattern.Sorting;

import java.util.Arrays;

/**
 * STRATEGY PATTERN: The Context
 * 
 * This class uses a SortStrategy to perform the actual sorting.
 * It doesn't know WHICH algorithm it is using, just that it can sort.
 */
public class Sorter {
    
    // The Context HAS-A Strategy
    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // Allows changing the algorithm at runtime
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sortArray(int[] numbers) {
        System.out.println("\n--- Original Array ---");
        System.out.println(Arrays.toString(numbers));
        
        // Delegate the work to the strategy object
        sortStrategy.sort(numbers);
        
        System.out.println("--- Sorted Array ---");
        System.out.println(Arrays.toString(numbers));
    }
}
