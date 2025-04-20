import java.util.ArrayList;
import java.util.Scanner;

import CustomExceptions.InvalidInputException;
import CustomExceptions.StudentNotFoundException;

/**
 * The StudentManager class handles operations related to student management,
 * such as adding, displaying, searching, updating, and deleting students.
 */
public class StudentManager {

    // List to store the student objects
    ArrayList<Student> students = new ArrayList<>();

    /**
     * Adds a new student to the list.
     *
     * @param sc Scanner object used for taking user input.
     */
    public void addStudent(Scanner sc) {
        // Prompt user for student details
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter DOB: ");
        String dob = sc.nextLine();
        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();
        sc.nextLine(); // clear buffer

        // Add new student to the list
        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully!");
    }

    /**
     * Displays all students in the list.
     */
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        // Iterate over each student and display their details
        for (Student s : students) {
            s.display();
        }
    }

    /**
     * Searches for a student by PRN and displays their details.
     *
     * @param sc Scanner object used for taking user input.
     * @throws StudentNotFoundException if student with the provided PRN is not found.
     */
    public void searchByPRN(Scanner sc) {
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();
        boolean found = false;
        
        // Search for student by PRN
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                s.display();
                found = true;
                break;
            }
        }
        
        // Throw exception if student is not found
        if (!found) throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    /**
     * Searches for students by name and displays their details.
     *
     * @param sc Scanner object used for taking user input.
     * @throws StudentNotFoundException if no student with the provided name is found.
     */
    public void searchByName(Scanner sc) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        boolean found = false;
        
        // Search for students by name
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                s.display();
                found = true;
            }
        }
        
        // Throw exception if student is not found
        if (!found) throw new StudentNotFoundException("Student with name " + name + " not found.");
    }

    /**
     * Searches for a student by their position in the list and displays their details.
     *
     * @param sc Scanner object used for taking user input.
     * @throws InvalidInputException if an invalid position is entered.
     */
    public void searchByPosition(Scanner sc) {
        System.out.print("Enter Position (0-based): ");
        int pos = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Check if the position is valid
        if (pos < 0 || pos >= students.size())
            throw new InvalidInputException("Invalid position entered.");

        // Display the student at the specified position
        students.get(pos).display();
    }

    /**
     * Updates a student's details based on their PRN.
     *
     * @param sc Scanner object used for taking user input.
     * @throws StudentNotFoundException if the student with the provided PRN is not found.
     */
    public void updateStudent(Scanner sc) {
        System.out.print("Enter PRN to update: ");
        String prn = sc.nextLine();
        boolean found = false;
        
        // Search for student by PRN to update their details
        for (Student s : students) {
            if (s.prn.equals(prn)) {
                // Update student details
                System.out.print("Enter new Name: ");
                s.name = sc.nextLine();
                System.out.print("Enter new DOB: ");
                s.dob = sc.nextLine();
                System.out.print("Enter new Marks: ");
                s.marks = sc.nextFloat();
                sc.nextLine(); // clear buffer
                found = true;
                System.out.println("Student updated.");
                break;
            }
        }
        
        // Throw exception if student is not found
        if (!found) throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    /**
     * Deletes a student from the list based on their PRN.
     *
     * @param sc Scanner object used for taking user input.
     * @throws StudentNotFoundException if the student with the provided PRN is not found.
     */
    public void deleteStudent(Scanner sc) {
        System.out.print("Enter PRN to delete: ");
        String prn = sc.nextLine();
        
        // Remove the student with the matching PRN
        boolean removed = students.removeIf(s -> s.prn.equals(prn));
        
        // Throw exception if student is not found
        if (!removed)
            throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
        System.out.println("Student deleted.");
    }
}

