package StrategyPattern.PhoneCameraApp;

public class CameraPlusApp extends PhoneCameraApp {

    public CameraPlusApp() {
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
