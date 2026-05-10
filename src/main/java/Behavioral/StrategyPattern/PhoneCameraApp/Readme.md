# Phone Camera App

This project is a simulation of a phone camera app that uses the Strategy Pattern to allow for different sharing behaviors.

## How to Run

To run the simulation, you first need to compile the Java code. You can do this by running the following command from the root of the project:

```bash
javac -d bin src/main/java/StrategyPattern/PhoneCameraApp/*.java
```

Once the code is compiled, you can run the simulation with the following command:

```bash
java -cp bin StrategyPattern.PhoneCameraApp.CameraAppSimulation
```

This will run the `CameraAppSimulation`, which will create a `BasicCameraApp` and call its methods.

## Strategy Pattern

The Strategy Pattern is a behavioral design pattern that allows you to define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

In this project, the `SharingBehavior` interface is the strategy, and the `ShareByText` and `ShareByEmail` classes are the concrete strategies. The `PhoneCameraApp` class is the context, and it uses a `SharingBehavior` object to share photos. This allows you to change the sharing behavior of a `PhoneCameraApp` object at runtime.
