package QA_java.QA_9_Static_And_nonStatic.IRINA_OOP_String_Classses_Object;

public class NMethods {



public static String checkAge(int age){
    if(age < 16) {
        return "Sory you are to young";
    } else if (age >=16 && age < 18){
        return "You can drive a car";
    } else if(age >=18 && age < 21) {
        return "You can buy lottery";
    }else {
        return "You can do whatever";

    }
 }

    public static void main(String[] args) {
        int age = 21;
        System.out.println(checkAge(age));
    }
    }
