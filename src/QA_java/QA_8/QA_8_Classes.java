package QA_java.QA_8;

public class QA_8_Classes {

        public static void main(String[] args) {


            QA_8_Car h = new QA_8_Car("honda");


           QA_8_Person a = new QA_8_Person();
            a.setName ("Alexey");
            a.setAge(30);
            a.setSex('m');

       //     QA_8_Person b = new QA_8_Person("Anna", 20, 'm');


            String name = a.getName();

            System.out.println(a.getName());
        //    System.out.println(a.car.name);
        //    System.out.println(b.getName());

    }
}
