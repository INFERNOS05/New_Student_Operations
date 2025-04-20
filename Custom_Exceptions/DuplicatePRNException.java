/**
 * Exception thrown when attempting to add a student whose PRN already exists in the system.
 * PRN (Permanent Registration Number) must be unique for each student.
 */
public class DuplicatePRNException extends Exception {

    /**
     * Constructs a new DuplicatePRNException with a detailed error message.
     *
     * @param prn The PRN that caused the duplication error.
     */
    public DuplicatePRNException(long prn) {
        super("Duplicate PRN detected: " + prn + ". Each student must have a unique PRN.");
    }
}

