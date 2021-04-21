package HW.HW_10;

public class Main {


        public static void main(String[] args) {
            Employee employee = new Employee("Alex", 33, 'M', 100 );
            System.out.println(employee.getSalary(MonthUtils.monthArray));

            Manager manager = new Manager("Alex", 33, 'M', 100, 3 );
            System.out.println(manager.getSalary(MonthUtils.monthArray));



    }
}
