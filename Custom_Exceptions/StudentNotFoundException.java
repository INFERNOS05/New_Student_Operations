package CustomExceptions;

/**
 * Custom exception class to handle the case when a student is not found.
 * This class extends RuntimeException, so it's an unchecked exception.
 */
public class StudentNotFoundException extends RuntimeException {

    /**
     * Constructor for StudentNotFoundException.
     *
     * @param message The error message to be passed when the exception is thrown.
     */
    public StudentNotFoundException(String message) {
        // Pass the message to the parent (RuntimeException) constructor
        super(message);
    }
}

