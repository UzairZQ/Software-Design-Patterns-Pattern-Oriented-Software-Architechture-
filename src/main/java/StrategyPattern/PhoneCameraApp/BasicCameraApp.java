package StrategyPattern.PhoneCameraApp;

/**
 * STRATEGY PATTERN: A Concrete Context
 */
public class BasicCameraApp extends PhoneCameraApp {

    public BasicCameraApp() {
        // We set the sharing behavior to 'Text' for the basic app.
        sharingBehavior = new ShareByText();
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking photo with basic camera app.");
    }

    @Override
    public void editPhoto() {
        System.out.println("Editing photo with basic camera app.");
    }

    @Override
    public void savePhoto() {
        System.out.println("Saving photo with basic camera app.");
    }
}
