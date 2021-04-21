package QA_java.QA_10_Inheritance;

public class Salary {

    public static int Salary(Employee[] employeeArray){
        int result = 0;
        for (int i = 0; i <employeeArray.length ; i++) {
            result = result + employeeArray[i].getSalary();
        }
        return result;
    }
}
