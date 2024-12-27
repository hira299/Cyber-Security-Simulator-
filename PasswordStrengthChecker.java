package c;

import java.util.Scanner;

public class PasswordStrengthChecker extends CyberSecurityFeature {
   @Override
   public void run() {
       Scanner scanner = new Scanner(System.in);
       displayTitle("Password Strength Checker");

       System.out.print("Enter password to check strength: ");
       String password = scanner.nextLine();
       String strength = checkStrength(password);
       System.out.println("Password Strength: " + strength);
   }

   // Encapsulated helper method (only used inside this class)
   private String checkStrength(String password) {
	   
if (password.length() < 6) return "Weak";
       
       if (password.matches("[a-zA-Z]+")) return "Moderate";
       
       if (password.matches(".\\d.") && password.matches(".[!@#$%^&].*")) return "Strong";
       
       return "Moderate";
       
	   
   }
   }