package HW.A;

public class A_5 {


    public static String updateLight(String current) {

        if (current == "red") {
            return "green";
        } else if (current == "green") {
            return "yellow";
        } else
            return "red";

    }

    public static void main(String[] args) {
        System.out.println(updateLight("yellow"));
    }
}
