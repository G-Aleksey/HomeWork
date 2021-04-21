package HW.HW_10;

public abstract class BaseEmployee {

    private String name;
    private int age;
    private char sex;
    private int salaryOfDay;


    public BaseEmployee(String name, int age, char sex, int salaryOfDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryOfDay = salaryOfDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalaryOfDay() {
        return salaryOfDay;
    }

    public void setSalaryOfDay(int salaryOfDay) {
        this.salaryOfDay = salaryOfDay;
    }
    public int getSalary(Month[] monthArray){
        int salary = 0;
        return salary;

    }

    }
