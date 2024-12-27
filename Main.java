package c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CyberSecurityFeature feature = null;
        int choice;

        do {
            System.out.println("\n=== Cyber Security Simulator ===");
            System.out.println("1. Password Strength Checker");
            System.out.println("2. Encrypt/Decrypt (Caesar Cipher)");
            System.out.println("3. Password Generator");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1 -> feature = new PasswordStrengthChecker();
                case 2 -> feature = new CipherSimulator();
                case 3 -> feature = new PasswordGenerator();
                case 4 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Please try again.");
            }

            if (feature != null) {
                feature.run();  // Polymorphism
            }

        } while (choice != 4);
    }
}