/*
Name: Sehajdeep Singh Sikka
PRN: 23070126119
Batch: AIML B2
*/

import java.util.Scanner; // Importing Scanner for user input

public class Main {

    // Main method - Entry point of the program
    public static void main(String[] args) {
        // Create Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        // Create an instance of StudentManager to manage students
        StudentManager manager = new StudentManager();

        // Variable to store user's menu choice
        int choice;

        // Menu loop - runs until the user chooses to exit (choice == 0)
        do {
            // Display the menu to the user
            System.out.println("\n===== Student Data Entry Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");

            // Prompt the user for input and read the choice
            System.out.print("Enter your choice: ");
            choice = sc.nextInt(); // Read the choice as an integer
            sc.nextLine(); // clear buffer

            // Switch statement to execute corresponding action based on the user's choice
            switch (choice) {
                case 1 -> manager.addStudent(sc); // Calls addStudent method
                case 2 -> manager.displayStudents(); // Calls displayStudents method
                case 3 -> manager.searchByPRN(sc); // Calls searchByPRN method
                case 4 -> manager.searchByName(sc); // Calls searchByName method
                case 5 -> manager.searchByPosition(sc); // Calls searchByPosition method
                case 6 -> manager.updateStudent(sc); // Calls updateStudent method
                case 7 -> manager.deleteStudent(sc); // Calls deleteStudent method
                case 0 -> System.out.println("Exiting..."); // Exits the program
                default -> System.out.println("Invalid choice!"); // Handles invalid choices
            }

        // Continue looping the menu until the user selects "0" to exit
        } while (choice != 0);

        // Close the scanner to release resources
        sc.close();
    }
}

