package QA_java.QA_8;

public class QA_8_Person {

    String name;
    int age;
    char sex;
   // QA_8_Car car;

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }




    /*
    public QA_8_Person(String name, int age, char sex, QA_8_Car car) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.car = car;
    }

    public QA_8_Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

     */

//    QA_8_Person(String name_, int age_, char sex_) {
//        name = name_;
//        age = age_;
//        sex = sex_;




    String getName(){
        if(sex == 'm') {
            return  "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

}
