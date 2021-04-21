package HW.HW_9;

import java.util.Objects;

public class EmployeeUtils {





    static int getSum(Employee[] employeesArry){
       int sum = 0;
        for (int i = 0; i < employeesArry.length; i++) {
            sum += employeesArry[i].salary;
        }
        return sum;
    }

    static Employee getMin(Employee[] employeesArry){
        Employee result = employeesArry[0];
        for (int i = 1; i < employeesArry.length; i++) {
            if (result.salary > employeesArry[i].salary) {
                result = employeesArry[i];
            }
        }
        return result;
    }
    static int getMAx(Employee[] employeesArry){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employeesArry.length; i++) {
            if (max < employeesArry[i].salary) {
                max = employeesArry[i].salary;
            }
        }
        return max;
    }

    public static Employee findByName(String  name, Employee[] employeesArry) {

        for (int i = 0; i < employeesArry.length; i++) {
            if (Objects.equals(name, employeesArry[i].person.name)) {
                return employeesArry[i];
            }
            }
            return null;
        }

    public static Employee findBySubName(String  subname, Employee[] employeesArry) {

        for (int i = 0; i < employeesArry.length; i++) {
            if (employeesArry[i].person.name != null && employeesArry[i].person.name.contains(subname)) {
                return employeesArry[i];
            }
        }
        return null;
    }

    public static boolean findemployee(Employee employee, Employee[] employeesArry) {

        for (int i = 0; i < employeesArry.length; i++) {
            if (employee == employeesArry[i]) {
                return true;
            }
        }
        return false;
    }



}
