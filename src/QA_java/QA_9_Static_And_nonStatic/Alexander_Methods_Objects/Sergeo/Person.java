package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects.Sergeo;

public class Person {

    String name;
    int age;
    char sex;


     public String getName() {
        if(sex == 'm') {
            return "Mr. " + name;
        } else
         return "Mrs " +  name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
