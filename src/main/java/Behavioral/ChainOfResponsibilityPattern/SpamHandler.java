package Behavioral.ChainOfResponsibilityPattern;

/**
 * CHAIN OF RESPONSIBILITY: Concrete Handler
 */
public class SpamHandler extends Handler {
    
    @Override
    public void handleRequest(Email email) {
        if (email.getType() == Email.Type.SPAM) {
            System.out.println("SpamHandler: Deleting spam email: " + email.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(email);
        }
    }
}
