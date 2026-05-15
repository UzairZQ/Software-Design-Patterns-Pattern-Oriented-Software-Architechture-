package Behavioral.ChainOfResponsibilityPattern;

/**
 * CHAIN OF RESPONSIBILITY: The Test Drive
 */
public class ChainTestDrive {
    public static void main(String[] args) {
        // 1. Create the handlers
        Handler spam = new SpamHandler();
        Handler complaint = new ComplaintHandler();
        Handler fan = new FanHandler();

        // 2. Chain them together
        // Spam -> Complaint -> Fan
        spam.setNext(complaint);
        complaint.setNext(fan);

        // 3. Create requests
        Email email1 = new Email(Email.Type.SPAM, "Win a free iPhone!");
        Email email2 = new Email(Email.Type.COMPLAINT, "Your pizza arrived cold!");
        Email email3 = new Email(Email.Type.FAN_MAIL, "I love your product!");
        Email email4 = new Email(Email.Type.OTHER, "Hello, how are you?");

        // 4. Send requests through the chain
        System.out.println("--- Processing Email 1 ---");
        spam.handleRequest(email1);

        System.out.println("\n--- Processing Email 2 ---");
        spam.handleRequest(email2);

        System.out.println("\n--- Processing Email 3 ---");
        spam.handleRequest(email3);

        System.out.println("\n--- Processing Email 4 ---");
        spam.handleRequest(email4);
    }
}
