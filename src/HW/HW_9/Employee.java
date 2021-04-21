package HW.HW_9;

import java.util.Objects;

public class Employee {

    Person person;
   int salary;


    public Employee(String name, int age, String gender, int salary) {
        this.person = new Person(name, age, gender);
        this.salary = salary;
    }

    boolean isSameName(Employee employee) {
        return Objects.equals(employee.person.name,this.person.name);

    }



}
