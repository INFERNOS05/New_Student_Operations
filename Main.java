/*
Name: Sehajdeep Singh Sikka
PRN: 23070126119
Batch: AIML B2
*/

import java.util.Scanner; // Importing Scanner for reading user input

public class Main {

    // Main method: Acts as the entry point for the Student Data Entry System
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner instance to capture user input from the console
        StudentManager manager = new StudentManager(); // Instance of StudentManager to perform operations on student records
        int choice; // Variable to store user's menu choice

        // Loop continues until user selects the Exit option (choice = 0)
        do {
            // Displaying the main menu
            System.out.println("\n===== Student Data Entry Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");

            // Prompt user for a menu option
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();      // Read numeric menu input
            sc.nextLine();              // Consume newline character left by nextInt()

            try {
                // Switch expression (Java 14+ syntax) to route user action
                switch (choice) {
                    case 1 -> manager.addStudent(sc);        // Adds a new student, may throw custom validation exceptions
                    case 2 -> manager.displayStudents();     // Displays all students in the system
                    case 3 -> manager.searchByPRN(sc);       // Searches a student by PRN number
                    case 4 -> manager.searchByName(sc);      // Searches students by name
                    case 5 -> manager.searchByPosition(sc);  // Displays student at a particular index/position
                    case 6 -> manager.updateStudent(sc);     // Updates an existing student, may throw validation exceptions
                    case 7 -> manager.deleteStudent(sc);     // Deletes a student record by PRN
                    case 0 -> System.out.println("Exiting..."); // Exits the program
                    default -> System.out.println("Invalid choice!"); // Handles invalid menu choices
                }
            } catch (DuplicatePRNException e) {
                // Handles scenario where a duplicate PRN is being inserted
                System.out.println("Error: Duplicate PRN entered. " + e.getMessage());
            } catch (InvalidCGPAException e) {
                // Handles case when CGPA is not within valid numeric bounds
                System.out.println("Error: Invalid CGPA provided. " + e.getMessage());
            } catch (InvalidBatchFormatException e) {
                // Handles improperly formatted batch input (e.g., "B2", "A1" expected)
                System.out.println("Error: Invalid Batch format. " + e.getMessage());
            } catch (Exception e) {
                // Generic fallback for any unexpected exceptions
                System.out.println("Unexpected error: " + e.getMessage());
            }

        } while (choice != 0); // Loop terminates when user selects 0 (Exit)

        sc.close(); // Release Scanner resource
    }
}

