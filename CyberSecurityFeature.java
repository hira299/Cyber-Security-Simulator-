package c;

public abstract class CyberSecurityFeature {
    // Abstract method to be implemented by child classes
    public abstract void run();

    // Common method for display (can be reused)
    public void displayTitle(String title) {
     System.out.println("\n=== " + title + " ===");  
        
    }
}