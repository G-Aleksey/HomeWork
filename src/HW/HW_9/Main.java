package HW.HW_9;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("San", 30, "male");
        Employee employee = new Employee("Sans", 25, "famale", 1000);
        Employee employee1 = new Employee("Sonic", 25, "famale", 1500);
        Employee employee2 = new Employee("Sani", 25, "famale", 2500);

        Employee[] employeeArray = {employee, employee1, employee2};

        System.out.println(EmployeeUtils.getSum(employeeArray));
        System.out.println(EmployeeUtils.getMin(employeeArray).person.name);
        System.out.println(EmployeeUtils.getMAx(employeeArray));
        System.out.println(EmployeeUtils.findByName("Sani", employeeArray));
        System.out.println(EmployeeUtils.findBySubName("Sa", employeeArray));
        System.out.println(EmployeeUtils.findemployee(employee, employeeArray));
    }
}
