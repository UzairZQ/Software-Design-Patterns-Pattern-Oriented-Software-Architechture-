package Behavioral.StrategyPattern.Sorting;

import java.util.Arrays;

/**
 * STRATEGY PATTERN: Concrete Strategy
 * 
 * Implements a faster Quick Sort algorithm.
 * (Using Arrays.sort() for brevity in this example)
 */
public class QuickSort implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorting array using Quick Sort strategy...");
        Arrays.sort(numbers);
    }
}
