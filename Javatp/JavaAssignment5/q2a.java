package JavaAssignment5;


public class q2a {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Explicitly throwing RuntimeException");
        } catch (RuntimeException e) {
            System.out.println("Caught the RuntimeException: " + e.getMessage());
        }
    }
    
}