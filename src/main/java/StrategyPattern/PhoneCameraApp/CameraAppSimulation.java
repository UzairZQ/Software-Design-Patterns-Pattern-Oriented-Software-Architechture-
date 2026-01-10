package StrategyPattern.PhoneCameraApp;

public class CameraAppSimulation {
    public static void main(String[] args) {
        PhoneCameraApp myCameraApp = new BasicCameraApp();
        myCameraApp.takePhoto();
        myCameraApp.editPhoto();
        myCameraApp.share();
        myCameraApp.savePhoto();
    }   
}
