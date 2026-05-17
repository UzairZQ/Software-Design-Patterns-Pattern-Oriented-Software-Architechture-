package Behavioral.StrategyPattern.Sorting;

/**
 * STRATEGY PATTERN: The Test Drive
 */
public class SortSimulator {
    public static void main(String[] args) {

        int[] data1 = { 64, 34, 25, 12, 22, 11, 90 };
        int[] data2 = { 99, 12, 5, 42, 7, 3, 100 };

        // 1. We start by giving the Sorter a BubbleSort strategy
        Sorter sorter = new Sorter(new MergeSort());

        // The sorter delegates the work to MergeSort
        sorter.sortArray(data1);

        System.out.println("\n... Changing strategy at runtime ...");

        // 2. We change the strategy dynamically to QuickSort
        sorter.setSortStrategy(new QuickSort());

        // Now the sorter delegates the work to QuickSort!
        sorter.sortArray(data2);
    }
}
