# Cyber Security Simulator - Java 

This Java-based application showcases fundamental cybersecurity functionalities, implemented with a focus on Object-Oriented Programming (OOP) principles. It includes three core features, each encapsulated in modular classes for clarity and maintainability.

```
CyberSecuritySimulator/
│
├── Main.java                         // Entry point (Abstraction)
├── CyberSecurityFeature.java         // Parent class (Inheritance)
├── PasswordStrengthChecker.java      // Child class (Encapsulation, Polymorphism)
├── CipherSimulator.java              // Child class (Encapsulation, Polymorphism)
└── PasswordGenerator.java            // Child class (Encapsulation, Polymorphism)
```

---

## Application Features and Functionalities

### 1. **Password Strength Checker**

- **Objective**: Analyzes the strength of a password based on predefined criteria and returns its classification as Weak, Moderate, or Strong.
- **Key OOP Concepts**:
  - **Encapsulation**: Encapsulates the logic for password validation within a private `checkStrength` method.
  - **Inheritance and Polymorphism**: Implements the abstract `run` method from the parent class, tailoring it for this specific functionality.

**Output Format Example**:
```
=== Password Strength Checker ===
Enter password to check strength: P@ssw0rd
Password Strength: Strong
```

---

### 2. **Cipher Simulator (Caesar Cipher)**

- **Objective**: Encrypts or decrypts user-provided text using the Caesar Cipher algorithm. Users specify a shift value for encryption (positive) or decryption (negative).
- **Key OOP Concepts**:
  - **Encapsulation**: Encapsulates the Caesar Cipher logic within a private `caesarCipher` method.
  - **Inheritance and Polymorphism**: Extends the abstract class `CyberSecurityFeature` and customizes the `run` method for this feature.

**Output Format Example**:
```
=== Caesar Cipher Simulator ===
Enter text to encrypt/decrypt: hello
Enter shift value (positive for encryption, negative for decryption): 3
Result: khoor
```

---

### 3. **Password Generator**

- **Objective**: Generates random, secure passwords of a specified length and displays them to the user.
- **Key OOP Concepts**:
  - **Encapsulation**: Password generation logic is encapsulated within the `generatePassword` method.
  - **Inheritance and Polymorphism**: Implements the `run` method to provide functionality specific to password generation.

**Output Format Example**:
```
=== Password Generator ===
Generated Password: aB1!xY2@
```

---

## Core Object-Oriented Programming Concepts

### 1. **Abstraction**
- The `CyberSecurityFeature` class provides a generic interface for all cybersecurity features through an abstract `run` method, enabling a consistent structure across all modules.

### 2. **Encapsulation**
- Critical operations, such as password validation, cipher encryption/decryption, and password generation, are encapsulated within private methods to ensure modularity and code integrity.

### 3. **Inheritance**
- Each feature-specific class (e.g., `PasswordStrengthChecker`, `CipherSimulator`, `PasswordGenerator`) extends the `CyberSecurityFeature` parent class, leveraging shared functionality.

### 4. **Polymorphism**
- The `run` method is overridden in each child class to provide feature-specific implementations, demonstrating polymorphism.

---

## Execution Instructions

1. **Compile** the entire project directory using a Java compiler:
   ```
   javac CyberSecuritySimulator/*.java
   ```

2. **Run the Main class** to start the application:
   ```
   java CyberSecuritySimulator.Main
   ```

3. **Select a feature** by entering the corresponding option number from the menu.

---

## System Requirements

- **Java Development Kit (JDK)**: Version 8 or later.
- **IDE or Command-Line Interface**: To compile and execute the program.

---

## Future Enhancements

- **Expand Encryption Algorithms**: Introduce advanced ciphers such as AES or RSA.
- **Data Persistence**: Enable saving and loading of generated passwords or encryption results.
- **Enhanced Validation**: Incorporate more comprehensive password strength metrics and dictionary-based analysis.

---

## Project Overview

This project serves as an academic demonstration of OOP principles in Java, applied to practical cybersecurity challenges. It provides a robust, extensible structure while simulating real-world functionalities for educational purposes.

