package Behavioral.IteratorPattern;

/**
 * ITERATOR PATTERN: A Concrete Aggregate
 * 
 * This menu uses a fixed-size Array (MenuItem[]) to store its items.
 */
public class DinerMenu implements Menu{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian Biryani", 4.99);
        addItem("Soup of the Day", 2.99);
    }
    
    public void addItem(String name, double price){
        if(numberOfItems < MAX_ITEMS ){
            menuItems[numberOfItems] = new MenuItem(name, price);
            numberOfItems++;
        }
    }

    /**
     * Every menu must implement createIterator() so the client 
     * doesn't have to know if it's an Array or a List.
     */
    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
