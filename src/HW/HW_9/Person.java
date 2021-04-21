package HW.HW_9;

public class Person {

   String name;
   int age;
    String gender;

    public Person() {}


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        if(gender.equals("male")) {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }


    public static void main(String[] args) {
        Person p1 = new Person("Vasay", 25, "male");
        Person p2 = new Person("Yen", 20, "famale");

        System.out.println("Hello " + " " + p1.getName());
        System.out.println("Hello " + " " + p2.getName());
    }
    }


