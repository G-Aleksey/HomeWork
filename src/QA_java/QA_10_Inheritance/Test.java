package QA_java.QA_10_Inheritance;

public class Test {
    public static void main(String[] args) {

   //         Person person1 = new Person();
 //       Person person = new Person("POP", 30, "male");

   //     Employee employee = new Employee();
        Employee employee1 = new Employee("Mary", "Engineer", 80000);
        Employee employee2 = new Employee("Mary", "Engineer", 90000);
     //   Manager manager = new Manager("Pary", 25, "famale");

        System.out.println(employee1.isSameName(employee2));
        Employee[] employees = new Employee[]{employee1, employee2};
        System.out.println(Salary.Salary(employees));
    }

}
