package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects;

public class PrintZ {
    public static void main(String[] args) {
        System.out.println(powerOf(2, 3));
        System.out.println(powerOf(2, 5));
        System.out.println(powerOf("12345678"));
    }

    public static int powerOf(int numper, int power) {

       int result = 1;
        for (int i = 1; i <= power ; i++) {
            result = result * numper;
        }
        return result;
    }
    public static int powerOf(String numberAsString ){
        System.out.println("Converting String to integer");
        int number = Integer.parseInt(numberAsString);
        return number;
            }
}
