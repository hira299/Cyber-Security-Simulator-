package c;

import java.util.Scanner;

public class CipherSimulator extends CyberSecurityFeature {
   @Override
   public void run() {
       Scanner scanner = new Scanner(System.in);
       displayTitle("Caesar Cipher Simulator");

       System.out.print("Enter text to encrypt/decrypt: ");
       String text = scanner.nextLine();
       System.out.print("Enter shift value (positive for encryption, negative for decryption): ");
       int shift = scanner.nextInt();

       String result = caesarCipher(text, shift);
       System.out.println("Result: " + result);
   }

   private String caesarCipher(String text, int shift) {
  
       StringBuilder result = new StringBuilder();

       for (char c : text.toCharArray()) {
           if (Character.isLetter(c)) {
               char base = Character.isUpperCase(c) ? 'A' : 'a';
               c = (char) ((c - base + shift + 26) % 26 + base);
           }
           result.append(c);
       }

       return result.toString();
   
   
   }
}