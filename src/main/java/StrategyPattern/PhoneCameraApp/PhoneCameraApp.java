package StrategyPattern.PhoneCameraApp;

public abstract class PhoneCameraApp {
    SharingBehavior sharingBehavior;
    public abstract void takePhoto();
    public abstract void editPhoto();   
    public abstract void savePhoto();
    public void share(){
        sharingBehavior.share();
    }
    }
