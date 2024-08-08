package JavaAssignment3;


public class q5 {
    public static void main(String[] args) {
        int m1=11,m2=9;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=19;j++){
                if((j%2==1) && (j>=m1) && (j<=m2)){
                    System.out.print("_");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            m1-=2;m2+=2;
        }
        m1+=2;m2-=2;
        m1+=2;m2-=2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=19;j++){
                if((j%2==1) && (j>=m1) && (j<=m2)){
                    System.out.print("_");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            m1+=2;m2-=2;
        }
    }
}