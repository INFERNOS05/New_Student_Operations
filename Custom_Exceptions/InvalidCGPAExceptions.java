/**
 * Exception thrown when a student's CGPA input is outside the valid range.
 * CGPA should typically be within the range of 0.0 to 10.0 in most grading systems.
 */
public class InvalidCGPAException extends Exception {

    /**
     * Constructs an InvalidCGPAException with a specific message indicating the invalid value.
     *
     * @param cgpa The CGPA value that was found to be invalid.
     */
    public InvalidCGPAException(double cgpa) {
        super("Invalid CGPA: " + cgpa + ". CGPA must be between 0.0 and 10.0.");
    }
}

