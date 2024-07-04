package JavaAssignment1;

public class q7 {

    public static void main(String[] args) {
        System.out.println("Pythagorean Triples (side1, side2, hypotenuse) where all sides are <= 500:");
 
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = side1; side2 <= 500; side2++) {
                int hypotenuse = computeHypotenuse(side1, side2);
                if (hypotenuse <= 500 && isPythagoreanTriple(side1, side2, hypotenuse)) {
                    System.out.printf("(%d, %d, %d)\n", side1, side2, hypotenuse);
                }
            }
        }
    }
 
    public static int computeHypotenuse(int a, int b) {
        return (int) Math.sqrt(a * a + b * b);
    }
 
    public static boolean isPythagoreanTriple(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
 }
 