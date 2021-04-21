package QA_java;

import java.util.Arrays;

public class QA_7_Methods {

   /*
    public static String getName(){
        String name = "Anna";
        return name;
    }
    //KISS == Keep it simple, stupid

    public static void greeting(String firstName, String LastName) {

        System.out.println("Hello " + firstName + " " + LastName + "!");
        System.out.println("Welcome to our website. ");
    }

    public static void main(String[] args) {

        String personName = getName();

        greeting("John", "Doe");


*/
   public static String[] getName(){
       String firstName = "Anna";
       String lastName = "Orlova";
       return new String[]{firstName, lastName};
   }
    //KISS == Keep it simple, stupid

    public static void greeting(String firstName, String lastName) {

        System.out.println("Hello " + firstName + " " + lastName + "!");
        System.out.println("Welcome to our website. ");
    }

    public static void main(String[] args) {

        String [] name = getName();
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(getName()));


        greeting("John", "Doe");
        greeting(name[0], name[1]);




        }
    }

