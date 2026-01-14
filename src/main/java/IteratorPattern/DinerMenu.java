package IteratorPattern;

public class DinerMenu implements Menu{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegeterian Biryani", 4.99);
        addItem("Soup of the Dayy", 2.99);
    }
    
    public void addItem(String name, double price){
        if(numberOfItems < MAX_ITEMS ){
            menuItems[numberOfItems] = new MenuItem(name, price);
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator(){
return new DinerMenuIterator(menuItems);
    }
    
}
