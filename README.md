# New_Student_Operations
# Student Management System

## Overview
This is a Java-based console application designed to manage student data. It supports CRUD operations (Create, Read, Update, Delete) using a class `StudentManager` that handles student data and custom exceptions for error management.

## Features
- **Add a student** with PRN, Name, DOB, and Marks.
- **Display all students** in the system.
- **Search by PRN** to find a specific student.
- **Search by Name** to find students matching the name.
- **Search by Position** to access a student by their index.
- **Update a student’s details** (PRN, Name, DOB, Marks).
- **Delete a student** from the system.
- Handles **custom exceptions** for invalid input or non-existing students.

---

## Requirements

- **Java 8 or higher**
- An IDE (like IntelliJ IDEA, Eclipse) or a simple text editor to write and compile the Java code.



## Folder Structure

```plaintext
/StudentManagementSystem
  /src
    /CustomExceptions
      - InvalidInputException.java
      - StudentNotFoundException.java
    - Student.java
    - StudentManager.java
    - Main.java
```

## Installation

1. Clone the repository or manually create the project structure.
2. Add each of the Java classes into the corresponding files.
3. In the terminal/command prompt, navigate to the `src` folder.
4. Compile the Java files using:

```bash
javac *.java
```

## Running the Program

1. Navigate to the project directory where the Java files are located.
2. Open a terminal or command prompt.
3. Compile the Java files:

```bash
javac *.java
```

## Code Structure

The program consists of the following classes:

1. **Main**: This is the entry point of the application. It displays the student data entry menu, handles user input, and calls the appropriate methods from the `StudentManager` class.
2. **StudentManager**: Handles the core functionality of adding, displaying, searching, updating, and deleting student records.
3. **Student**: Represents a student with attributes like PRN, Name, DOB, and Marks. It also contains a method to display student information.
4. **CustomExceptions**:
   - **InvalidInputException**: A custom exception that handles invalid input for position-based student search.
   - **StudentNotFoundException**: A custom exception that handles cases when a student is not found.

---

## Explanation of the Code

### 1. Main Class:
- The `Main` class contains the `main` method, which serves as the entry point for the program. 
- It presents a menu to the user for different student operations like adding, displaying, updating, and deleting students.
- The program will continue to run in a loop until the user chooses to exit (option 0).

### 2. StudentManager Class:
- **addStudent(Scanner sc)**: This method collects user input for adding a student, such as PRN, name, DOB, and marks, and then creates a new `Student` object.
- **displayStudents()**: Displays all students stored in the list. If there are no students, it informs the user.
- **searchByPRN(Scanner sc)**: Prompts the user to enter a PRN and searches for the student. If the student is not found, it throws a `StudentNotFoundException`.
- **searchByName(Scanner sc)**: Allows searching students by their name. If the student is not found, it throws a `StudentNotFoundException`.
- **searchByPosition(Scanner sc)**: Searches for a student by their position in the list. If the position is invalid, it throws an `InvalidInputException`.
- **updateStudent(Scanner sc)**: Allows updating a student's details by searching for their PRN and modifying their information.
- **deleteStudent(Scanner sc)**: Deletes a student by PRN. If the student is not found, it throws a `StudentNotFoundException`.

### 3. Custom Exceptions:
- **InvalidInputException**: This exception is thrown when the user inputs an invalid position during a position-based search.
- **StudentNotFoundException**: This exception is thrown when the program cannot find a student by PRN, name, or position.

---

## Error Handling

The program is designed to handle various errors:
- **InputMismatchException**: This occurs when the user enters non-numeric data where a number is expected.
- **StudentNotFoundException**: This is thrown if the student is not found based on the input criteria (PRN, Name, Position).
- **InvalidInputException**: This exception is triggered when the user inputs an invalid index for searching students by position.
- **Generic Exception Handling**: Any unexpected errors are caught and displayed with a message to the user.

---

## Conclusion

This program effectively demonstrates the use of object-oriented principles in managing student data. It also showcases custom exception handling to improve the user experience and ensure that the application behaves correctly even in case of errors.

