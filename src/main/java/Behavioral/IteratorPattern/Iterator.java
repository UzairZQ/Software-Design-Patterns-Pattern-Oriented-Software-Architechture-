package Behavioral.IteratorPattern;

/**
 * ITERATOR PATTERN: The Iterator Interface
 * 
 * The goal of the Iterator pattern is to provide a way to access the elements 
 * of a collection (like a List or an Array) without exposing how that 
 * collection is stored internally.
 */
public interface Iterator {
    /**
     * returns true if there are more elements to loop through.
     */
    boolean hasNext();

    /**
     * returns the next element in the collection.
     */
    Object next();
}
