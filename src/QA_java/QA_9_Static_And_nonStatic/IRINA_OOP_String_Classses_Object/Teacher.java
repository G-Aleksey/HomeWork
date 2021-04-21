package QA_java.QA_9_Static_And_nonStatic.IRINA_OOP_String_Classses_Object;

public class Teacher {

    private String  firstName;
    private String LastName;
    private int age;
    private String subject;
    private boolean isTeacher;

    Teacher () {

    }

    Teacher(boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

    Teacher(String firstName, String lastName, int age, String subject, boolean isTeacher) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.setAge(age);
        this.setIsTeacher(isTeacher);
        this.setSubject(subject);
    }

    Teacher(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.setAge(age);
    }
    public String getFirstName(){
        return firstName;
    }

    public void setIsTeacher( boolean isTeacher){
        if(getIsTeacher() == false){
            this.isTeacher = false;
        }else if(getIsTeacher()){
            this.isTeacher = true;
        }else {
            this.isTeacher = isTeacher;
        }



    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public boolean getIsTeacher() {
        return isTeacher;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setAge(int age) {
        if (age >= 21 && age < 65) {
            this.age = age;
        } else {
            System.out.println("Not eligible age");
            this.isTeacher = false;
            this.subject = null;
        }
    }

    public void setSubject(String subject) {
        if(getIsTeacher() == false) {
            this.subject = null;
        } else if (getIsTeacher()) {
            this.subject = subject;
        } else {
            this.subject = subject;
        }
    }

        public void printCard(String firstName, String lastName, int age, String subject, boolean isTeacher) {
            System.out.println("_______________________________");
        if(isTeacher) {
            System.out.println("Teacher");
        }
        System.out.println(firstName + " " + lastName + " " + age );
            System.out.println(subject);
        }

}



