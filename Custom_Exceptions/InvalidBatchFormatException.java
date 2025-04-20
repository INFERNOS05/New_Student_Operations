/**
 * Exception thrown when the batch format of a student does not match the expected pattern.
 * For example, valid format could be "2023-27" representing academic years.
 */
public class InvalidBatchFormatException extends Exception {

    /**
     * Constructs a new InvalidBatchFormatException with a detailed message.
     *
     * @param batch The invalid batch input provided by the user.
     */
    public InvalidBatchFormatException(String batch) {
        super("Invalid batch format: \"" + batch + "\". Expected format: YYYY-YY (e.g., 2023-27).");
    }
}
