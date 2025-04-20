package CustomExceptions;

/**
 * Custom exception class to handle invalid input scenarios.
 * This class extends RuntimeException, so it is an unchecked exception.
 */
public class InvalidInputException extends RuntimeException {

    /**
     * Constructor for InvalidInputException.
     *
     * @param message The error message to be passed when the exception is thrown.
     */
    public InvalidInputException(String message) {
        // Pass the message to the parent (RuntimeException) constructor
        super(message);
    }
}

