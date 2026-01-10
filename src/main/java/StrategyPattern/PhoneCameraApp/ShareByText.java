package StrategyPattern.PhoneCameraApp;

public class ShareByText implements SharingBehavior {
    @Override
    public void share() {
        System.out.println("Sharing by text message.");
    }
}
