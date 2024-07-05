package JavaAssignment5;



public class q1a {
  

   static void issue() {
      try {
         throw new Exception("test exception");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }

   public static void main(String[] var0) {
      issue();
   }
}
