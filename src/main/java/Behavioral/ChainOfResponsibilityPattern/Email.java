package Behavioral.ChainOfResponsibilityPattern;

/**
 * CHAIN OF RESPONSIBILITY: The Request
 */
public class Email {
    public enum Type { SPAM, COMPLAINT, FAN_MAIL, OTHER }
    
    private Type type;
    private String content;

    public Email(Type type, String content) {
        this.type = type;
        this.content = content;
    }

    public Type getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}
