package HW.HW_C_2;

public class HW_2_BasicOperations {

    public static Integer basicMath(String op, int v1, int v2){
        int result = 0;
        if(op =="+") {
            result = v1 + v2;
        }else if(op =="-") {
            result = v1 - v2;
        }else if(op =="*") {
            result = v1 * v2;
        }else if(op =="/") {
            result = v1 / v2;
        }
        return result;
    }

    // {
    //  switch (op) {
    //    case "-":
    //      return v1 - v2;
    //    case "+":
    //      return v1 + v2;
    //    case "*":
    //      return v1 * v2;
    //    case "/": {
    //      if (v2 == 0)
    //        throw new IllegalArgumentException("Division by zero");
    //      return v1 / v2;
    //    }
    //    default:
    //      throw new IllegalArgumentException("Unknown operation: " + op);
    //    }


    public static void main(String[] args) {

        System.out.println(
                basicMath("+", 4, 7)
        );
        System.out.println(
                basicMath("-", 15, 18)
        );
        System.out.println(
                basicMath("*", 5, 5)
        );
        System.out.println(
                basicMath("/", 49, 7)
        );
    }
}
