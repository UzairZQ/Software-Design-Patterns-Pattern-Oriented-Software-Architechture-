package Behavioral.StrategyPattern.PhoneCameraApp;

/**
 * STRATEGY PATTERN: A Concrete Strategy
 */
public class ShareByText implements SharingBehavior {
    @Override
    public void share() {
        System.out.println("Sharing by text message.");
    }
}
