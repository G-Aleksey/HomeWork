package QA_java.QA_10_Inheritance;

public class Employee extends Person {

    String title;
   private int salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee() {
        System.out.println("Employee 1 constructor");

    }

    public Employee(String name, String title, int salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
        System.out.println("Employee second constructor");
    }
    public Employee(int age) {
        this.age = age;
        System.out.println("Employee second constructor");
    }



    public boolean isSameName(Employee employee){
        return  employee.getName().equals(this.name);
    }



}
