package HW.HW_11;

import java.util.Objects;

public class Utils {

    public static String searchName(String name, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (Objects.equals(name, employees[i].getName())) {
                return employees[i].getName();
            }
        }
        return null;
    }

    public static String findSubName(String subname, Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().contains(subname)) {
                return employees[i].getName();
            }

        }
        return null;
    }

    public static int allSalary(Employee[] employees) {
        int allSalary = 0;
        for (int i = 0; i <employees.length ; i++) {
            allSalary = allSalary + employees[i].getSalary();

        }
        return allSalary;
    }

    public static int maxSalary(Employee[] employees) {
        int minSalary = Integer.MIN_VALUE;
        for (int i = 0; i <employees.length ; i++) {
           if(minSalary < employees[i].getSalary()){
               minSalary = employees[i].getSalary();
           }

        }
        return minSalary;
    }

    public static int minSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i <employees.length ; i++) {
            if(minSalary > employees[i].getSalary()){
                minSalary = employees[i].getSalary();
            }

        }
        return minSalary;
    }

    public static Manager minWorker(Manager[] managers){
        Manager result = managers[0];
        for (int i = 0; i <managers.length ; i++) {
            if(result.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates());
            result = managers[i];

        }
        return result;
    }


    public static Manager maxWorker(Manager[] managers){
        Manager result = managers[0];
        for (int i = 0; i <managers.length ; i++) {
            if(result.getNumberOfSubordinates() < managers[i].getNumberOfSubordinates());
            result = managers[i];

        }
        return result;
    }

//    public static Manager maxProfit(Manager[] workers){
//        Manager result = workers[0];
//        for (int i = 0; i <workers.length ; i++) {
//            if(result.getSalary() - result.getBaseSalary()) > workers[i].getNumberOfSubordinates());
//            result = workers[i];
//
//        }
//        return result;
//    }

}
