package IteratorPattern;

import java.util.List;

/**
 * ITERATOR PATTERN: A Concrete Iterator
 * 
 * This class handles the logic of stepping through a MenuItem List (ArrayList).
 */
public class PancakeHouseIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    public Object next() {
        return items.get(position++);
    }

    public boolean hasNext() {
        return position < items.size();
    }
}
