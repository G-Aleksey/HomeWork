package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects;

import java.util.Arrays;

public class PersonRunner {
    public static void main(String[] args) {
        Person p1 = new Person("Jon", "Silver", "male");
//
        Person p2 = new Person();
   //     p2.lastName = "Kuzov";
        p2.setFirstName("Kuzov");
        p2.setLastName("Bin");
        p2.setGender("female");

        Person p3 = new Person("Sici", "Bili", 1999, 12, 10, "famale");
        System.out.println(p3.getAge());

        Person p4 = new Person("Sici", "Bili", 1999, 12, 10, "famale");
        System.out.println(p4.getAge());
        System.out.println(Person.getPlanet());
     //   Person.planet = "Mars";
        System.out.println(Person.getPlanet());
        System.out.println(Person.getPopulation());


       // Arrays.toString()



    }
}
