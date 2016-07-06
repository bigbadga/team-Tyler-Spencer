package byui.cit260.mansion.exceptions;

/**
 *
 * @author che11_000
 */
public class MapControlExeption extends Exception{

    public MapControlExeption() {
    }

    public MapControlExeption(String message) {
        super(message);
    }

    public MapControlExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public MapControlExeption(Throwable cause) {
        super(cause);
    }

    public MapControlExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}