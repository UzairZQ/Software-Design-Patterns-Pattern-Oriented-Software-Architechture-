package IteratorPattern;

/**
 * ITERATOR PATTERN: A Concrete Iterator
 * 
 * This class handles the logic of stepping through a MenuItem array.
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    /**
     * Gets the current item and moves the pointer to the next one.
     */
    public Object next(){
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    /**
     * Checks if there's another item in the array.
     */
    public boolean hasNext(){
        // We check if we're past the array length OR if the next spot is empty.
        return position < items.length && items[position] != null;
    }
}
