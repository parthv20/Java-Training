package JavaAssignment5;

public class q2b {
    
    public static void main(String[] args) {
        try {
            handleUncheckedException();
        } catch (RuntimeException e) {
            System.out.println("Caught the RuntimeException in calling method: " + e.getMessage());
        }
    }

    public static void handleUncheckedException() {
        throw new RuntimeException("Explicitly throwing RuntimeException");
    }
}