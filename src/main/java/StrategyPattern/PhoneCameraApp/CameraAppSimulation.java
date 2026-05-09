package StrategyPattern.PhoneCameraApp;

/**
 * STRATEGY PATTERN: The Simulator
 */
public class CameraAppSimulation {
    public static void main(String[] args) {
        // 1. Create a basic camera app
        PhoneCameraApp myCameraApp = new BasicCameraApp();
        
        // 2. Perform actions
        myCameraApp.takePhoto();
        myCameraApp.editPhoto();
        
        // This will print "Sharing by text message"
        myCameraApp.share(); 
        
        myCameraApp.savePhoto();
    }   
}
