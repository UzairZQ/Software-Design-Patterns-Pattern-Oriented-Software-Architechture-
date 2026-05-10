# Design Patterns Study Guide 📚

This guide summarizes the design patterns implemented in this project, categorized into their three main types as defined in *Head First Design Patterns*.

---

## 🏗️ Creational Patterns
*Focus: How objects are created.*

### 1. Factory Pattern (Simple Factory)
- **Definition**: Encapsulates object creation logic in one place.
- **Simple Words**: Instead of using `new` everywhere, you ask a "Factory" to make the object for you. This keeps your code clean if you ever add new types of objects.
- **Our Example**: `SimplePizzaFactory` decides whether to create a `CheesePizza` or `VeggiePizza`. The `PizzaStore` doesn't care how it's made!
- **HFDP Quote**: "Encapsulate what varies." (In this case, object creation).

---

## 🏛️ Structural Patterns
*Focus: How classes and objects are composed to form larger structures.*

### 2. Adapter Pattern
- **Definition**: Converts the interface of a class into another interface clients expect.
- **Simple Words**: It's like a travel power adapter. It lets two things work together that wouldn't normally fit.
- **Our Example**: `TurkeyAdapter` makes a Turkey look like a Duck so it can be used in the `DuckSimulator`.
- **HFDP Quote**: "Adapters change the interface to match what the client expects."

### 3. Decorator Pattern
- **Definition**: Attaches additional responsibilities to an object dynamically.
- **Simple Words**: Like adding toppings to a pizza or condiments to coffee. You "wrap" your object in another object to add features without changing the original class.
- **Our Example**: Starting with a `DarkRoast` (Beverage) and wrapping it in `Mocha` and `Whip` (Decorators) to calculate the total cost.
- **HFDP Quote**: "Classes should be open for extension, but closed for modification."

---

## ⚙️ Behavioral Patterns
*Focus: How objects communicate and distribute responsibility.*

### 4. Strategy Pattern
- **Definition**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- **Simple Words**: Instead of hardcoding a behavior (like flying), you give the object a "behavior object" that can be changed even at runtime.
- **Our Example**: A `Duck` has a `FlyBehavior`. We can change a `MallardDuck` from `FlyWithWings` to `FlyRocketPowered` instantly!
- **HFDP Quote**: "Favor composition over inheritance."

### 5. Observer Pattern
- **Definition**: Defines a one-to-many dependency so that when one object changes state, all its dependents are notified.
- **Simple Words**: Like a YouTube subscription. When the "Subject" (the channel) posts a video, all "Observers" (subscribers) get a notification automatically.
- **Our Example**: The `WeatherStation` (Subject) notifies the `UserInterface` and `Logger` (Observers) whenever the temperature changes.
- **HFDP Quote**: "Strive for loose coupling between objects that interact."

### 6. Iterator Pattern
- **Definition**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- **Simple Words**: It gives you a standard way to loop through a collection, whether it's an Array, a List, or a Map. You just say `hasNext()` and `next()`.
- **Our Example**: The `Waitress` uses an Iterator to print items from both the `DinerMenu` (Array) and `PancakeHouseMenu` (List) using the exact same loop.
- **HFDP Quote**: "An aggregate object should provide a way to access its elements without exposing its internal structure."

### 7. Command Pattern
- **Definition**: Encapsulates a request as an object, letting you parameterize clients with different requests.
- **Simple Words**: Like a waiter taking an order. The "order" is an object that knows how to get the job done. The person asking (Remote Control) doesn't need to know how the "receiver" (Light) works.
- **Our Example**: The `SimpleRemoteControl` (Invoker) takes a `LightOnCommand` and just calls `execute()`.
- **HFDP Quote**: "The Command Pattern decouples an object making a request from the one that knows how to perform it."

### 8. Template Method Pattern
- **Definition**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
- **Simple Words**: It's like a cooking recipe. The steps are the same every time, but some ingredients change. The base class sets the "order" of steps, and the child classes provide the details for the "blanks."
- **Our Example**: `CaffeineBeverage` has the recipe for making a drink (Boil -> Brew -> Pour -> Add Condiments). `Tea` and `Coffee` just provide the specific `brew()` and `addCondiments()` logic.
- **HFDP Quote**: "The Template Method defines the steps of an algorithm and allows subclasses to provide the implementation for one or more steps."

---

### 🎓 Exam Cheat Sheet
- **Want to change behavior at runtime?** -> Strategy
- **Want to notify others about changes?** -> Observer
- **Want to add features without sub-classing?** -> Decorator
- **Want to make an old class fit a new interface?** -> Adapter
- **Want to loop through different collection types?** -> Iterator
- **Want to decouple the requester from the doer?** -> Command
- **Want to hide the mess of object creation?** -> Factory
