

pacakage JavaAssignment5;




public class q1b {
    static void method() throws Exception{
        throw new Exception("test Exception");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println(e.getMessage());    
        }
    }
}

/* public class q1b {
    static void issue() throws Exception{
        throw new Exception("test Exception");
    }

    public static void main(String[] args) {
        try {
            issue();
        } catch (Exception e) {
            System.out.println(e.getMessage());    
        }
    }

   
} */

