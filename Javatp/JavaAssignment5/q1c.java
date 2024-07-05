package JavaAssignment5;

class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

public class q1c {
    public static void main(String[] args) {
        // This will cause a compilation error
        throwException();
    }

    public static void throwException() throws MyCheckedException {
        throw new MyCheckedException("Exception thrown in throwException method.");
    }
}