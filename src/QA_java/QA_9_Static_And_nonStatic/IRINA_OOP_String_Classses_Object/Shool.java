package QA_java.QA_9_Static_And_nonStatic.IRINA_OOP_String_Classses_Object;

public class Shool {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Vasay", "Perviy", 55);
        Teacher teacher3 = new Teacher("Ivan", "Petrovich", 55, "Math", true);
        Teacher teacher4 = new Teacher(true);
        Teacher teacher11 = new Teacher("Elena", "Sergeevna", 25, "English", true);

        System.out.println(teacher2.getFirstName());
        teacher1.setIsTeacher(false);
        teacher3.printCard(teacher3.getFirstName(), teacher3.getLastName(), teacher3.getAge(), teacher3.getSubject(), teacher3.getIsTeacher());

        teacher2.setIsTeacher(true);
        teacher2.setSubject("Geagrafic");
        teacher2.printCard(teacher2.getFirstName(), teacher2.getLastName(), teacher2.getAge(), teacher2.getSubject(), teacher2.getIsTeacher());
        teacher11.printCard(teacher11.getFirstName(), teacher11.getLastName(), teacher11.getAge(), teacher11.getSubject(), teacher11.getIsTeacher());
        teacher11.setAge(-100);
        teacher11.printCard(teacher11.getFirstName(), teacher11.getLastName(), teacher11.getAge(), teacher11.getSubject(), teacher11.getIsTeacher());
    }

}
