package Behavioral.ChainOfResponsibilityPattern;

/**
 * CHAIN OF RESPONSIBILITY: Concrete Handler
 */
public class FanHandler extends Handler {
    
    @Override
    public void handleRequest(Email email) {
        if (email.getType() == Email.Type.FAN_MAIL) {
            System.out.println("FanHandler: Sending to CEO: " + email.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(email);
        } else {
            System.out.println("Default: Archiving unknown email: " + email.getContent());
        }
    }
}
