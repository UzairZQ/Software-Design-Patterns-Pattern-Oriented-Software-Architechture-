package Behavioral.ChainOfResponsibilityPattern;

/**
 * CHAIN OF RESPONSIBILITY: The Handler Base Class
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Email email);
}
