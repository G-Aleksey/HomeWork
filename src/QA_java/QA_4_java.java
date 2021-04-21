package QA_java;

public class QA_4_java {
    public static void main(String[] args) {

   /*     for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j);
            }
        }
*/
        
        int a = 0;
        while (a <= 9) {
            a++;
            int j = 0;
            while (j <= 9) {
                j++;
                System.out.print( a + j +" ");
            }
            System.out.println( j + " ");
        }
    }
}


