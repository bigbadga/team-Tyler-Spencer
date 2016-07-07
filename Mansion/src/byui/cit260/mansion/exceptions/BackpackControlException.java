package byui.cit260.mansion.exceptions;

/**
 *
 * @author che11_000
 */
public class BackpackControlException extends Exception{

    public BackpackControlException() {
    }

    public BackpackControlException(String message) {
        super(message);
    }

    public BackpackControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public BackpackControlException(Throwable cause) {
        super(cause);
    }

    public BackpackControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}