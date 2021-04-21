package QA_java.QA_13_inner_abstract;

public class Main {



    // inner
   public class Person1 {


    }

    //  nested
   public static class Person2 {

       public static class Person21{

       }

    }

    public static void main(String[] args) {

       Main.Person2 v = new Main.Person2();

       Main main = new Main();
       Main.Person1 person1 = main.new Person1();
    }

}
