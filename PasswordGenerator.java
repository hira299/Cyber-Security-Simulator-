package c;

import java.util.Random;

public class PasswordGenerator extends CyberSecurityFeature {
   @Override
   public void run() {
       displayTitle("Password Generator");
       int passwordLength = 8;
       String password = generatePassword(passwordLength);
       System.out.println("Generated Password: " + password);
   }

   private  String generatePassword(int length) {
	   String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
       StringBuilder password = new StringBuilder();
       Random random = new Random();

       for (int i = 0; i < length; i++) {
           int index = random.nextInt(characters.length());
           password.append(characters.charAt(index));
       }

       return password.toString();  

   }       
}