/**
 * The Student class represents a student with details like PRN, name, date of birth, and marks.
 */
public class Student {

    // Instance variables to store the student's details
    String prn;  // PRN (Personal Registration Number) of the student
    String name; // Name of the student
    String dob;  // Date of birth of the student
    float marks; // Marks obtained by the student

    /**
     * Constructor to initialize the student object with given details.
     *
     * @param prn   The personal registration number of the student.
     * @param name  The name of the student.
     * @param dob   The date of birth of the student.
     * @param marks The marks obtained by the student.
     */
    public Student(String prn, String name, String dob, float marks) {
        this.prn = prn;    // Assign the provided PRN to the prn instance variable
        this.name = name;  // Assign the provided name to the name instance variable
        this.dob = dob;    // Assign the provided DOB to the dob instance variable
        this.marks = marks; // Assign the provided marks to the marks instance variable
    }

    /**
     * Displays the student's details in a formatted manner.
     */
    public void display() {
        // Print the student's details (PRN, Name, DOB, and Marks) to the console
        System.out.println("PRN: " + prn + ", Name: " + name + ", DOB: " + dob + ", Marks: " + marks);
    }
}

