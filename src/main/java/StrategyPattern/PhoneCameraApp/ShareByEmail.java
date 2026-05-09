package StrategyPattern.PhoneCameraApp;

/**
 * STRATEGY PATTERN: A Concrete Strategy
 */
public class ShareByEmail implements SharingBehavior {
    @Override
    public void share() {
        System.out.println("Sharing by email.");
    }
}
