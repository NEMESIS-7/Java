# Java Basics Project

Welcome to the **Java Basics Project**! This repository is designed to help beginners get started with Java programming while learning about basic Git operations.

## Purpose
The project demonstrates fundamental Java concepts such as:
- Data types
- Variables
- Flow control (if-else, loops, etc.)
- Switch statements
- Basic input and output (I/O)

It also introduces Git workflows like forking a repository, cloning it, making changes, committing, and pushing updates.

---

## Prerequisites
1. Install [Java JDK](https://www.oracle.com/java/technologies/javase-jdk-downloads.html).
2. Install [Git](https://git-scm.com/).
3. Install [IntelliJ IDEA](https://www.jetbrains.com/idea/).

---

## How to Use This Repository
### 1. Fork the Repository
- Click the **Fork** button on the top-right corner of this repository in GitHub to create your own copy.

### 2. Clone Your Forked Repository
```bash
git clone <your-forked-repository-url>
```

### 3. Open the Project in IntelliJ IDEA
1. Open IntelliJ IDEA.
2. Click on **File > Open**.
3. Navigate to the cloned project directory and select it.
4. Click **Open** to load the project.

### 4. Run the Code
1. Open `Main.java` from the Project Explorer.
2. Click on the green play button next to the `main` method to run the program.

---

## Project Structure
- **Main.java**: Entry point of the application with examples of basic Java concepts.
- **README.md**: Documentation for the project.

---

## Java Topics Covered
### Data Types and Variables
```java
int number = 10;
double price = 19.99;
boolean isAvailable = true;
char grade = 'A';
String message = "Hello, Java!";
```

### Flow Control
#### If-Else Example
```java
if (number > 0) {
    System.out.println("The number is positive.");
} else {
    System.out.println("The number is not positive.");
}
```

#### Loops Example
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Count: " + i);
}
```

### Switch Statements
```java
int day = 2;
switch (day) {
    case 1: 
        System.out.println("Monday");
        break;
    case 2: 
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other day");
}
```

---

## Assignment
### Objective
Use this project to practice Java basics and Git workflows.

### Steps
1. **Understand the Basics**:
   - Review the `Main.java` file and understand how each Java concept (data types, variables, if-else, loops, and switch) is implemented.

2. **Modify the Code**:
   - Add your own examples of data types and variables with different values.
   - Implement a new `if-else` condition to check if a number is even or odd.
   - Extend the `for` loop to count from 6 to 10.
   - Add more `case` statements in the `switch` block for days of the week.

3. **Practice Git Workflow**:
   - Fork the repository and clone it to your local machine.
   - Make the above changes in the `Main.java` file.
   - Commit your changes with meaningful messages (e.g., `Added examples for even/odd check`).
   - Push your changes to your forked repository.

4. **Optional**:
   - Create a pull request to propose your changes to the original repository.

---

## Additional Resources
- [Java Documentation](https://docs.oracle.com/en/java/)
- [Git Handbook](https://docs.github.com/en/get-started/quickstart)
- [IntelliJ IDEA Documentation](https://www.jetbrains.com/help/idea/)

---

