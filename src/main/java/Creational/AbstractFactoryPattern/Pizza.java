package Creational.AbstractFactoryPattern;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    abstract void prepare();
    void bake() { System.out.println("Bake for 25 minutes at 350"); }
    void cut() { System.out.println("Cutting the pizza into diagonal slices"); }
    void box() { System.out.println("Place pizza in official PizzaStore box"); }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + " ----\n");
        if (dough != null) display.append(dough + "\n");
        if (sauce != null) display.append(sauce + "\n");
        if (cheese != null) display.append(cheese + "\n");
        return display.toString();
    }
}
