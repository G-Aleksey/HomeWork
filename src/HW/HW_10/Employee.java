package HW.HW_10;

public final class Employee extends BaseEmployee  {



//    public Employee(String name, int age, char sex, int salaryOfDay) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.salaryOfDay = salaryOfDay;
//    }


    public Employee(String name, int age, char sex, int salaryOfDay) {
        super(name, age, sex, salaryOfDay);
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int salary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            salary += monthArray[i].getCountWorkDay() * getSalaryOfDay();

        }
        return salary;
    }

}
