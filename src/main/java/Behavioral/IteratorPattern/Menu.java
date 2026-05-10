package Behavioral.IteratorPattern;

/**
 * ITERATOR PATTERN: The Aggregate Interface
 * 
 * Every collection (Menu) that wants to be traversable 
 * must implement this and return an Iterator.
 */
public interface Menu {
    Iterator createIterator();
}
