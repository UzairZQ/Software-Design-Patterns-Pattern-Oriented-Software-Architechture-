package Behavioral.StrategyPattern.PhoneCameraApp;

/**
 * STRATEGY PATTERN: The Context Class
 * 
 * Every camera app shares some basic features (take, edit, save), 
 * but the way they SHARE photos can vary (Email, Text, Social Media).
 */
public abstract class PhoneCameraApp {
    
    // We encapsulate the sharing behavior
    SharingBehavior sharingBehavior;

    public abstract void takePhoto();
    public abstract void editPhoto();   
    public abstract void savePhoto();

    /**
     * Delegation: We ask the sharingBehavior object to do the work.
     */
    public void share(){
        sharingBehavior.share();
    }
}
