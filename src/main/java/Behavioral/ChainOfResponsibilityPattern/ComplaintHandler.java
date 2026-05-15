package Behavioral.ChainOfResponsibilityPattern;

/**
 * CHAIN OF RESPONSIBILITY: Concrete Handler
 */
public class ComplaintHandler extends Handler {
    
    @Override
    public void handleRequest(Email email) {
        if (email.getType() == Email.Type.COMPLAINT) {
            System.out.println("ComplaintHandler: Sending to legal department: " + email.getContent());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(email);
        }
    }
}
