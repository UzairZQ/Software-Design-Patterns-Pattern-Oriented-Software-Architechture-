package Behavioral.StrategyPattern.PhoneCameraApp;

/**
 * STRATEGY PATTERN: A Concrete Context
 */
public class CameraPlusApp extends PhoneCameraApp {

    public CameraPlusApp() {
        // This app uses 'Email' sharing by default.
        sharingBehavior = new ShareByEmail();
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with Camera Plus App");
    }

    @Override
    public void editPhoto() {
        System.out.println("Editing photo with Camera Plus App");
    }

    @Override
    public void savePhoto() {
        System.out.println("Saving photo with Camera Plus App");
    }
}
