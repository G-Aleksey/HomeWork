package HW.HW_11;

public abstract class Employee {

   private int BaseSalary;
   private String name;
    private int NumberOfSubordinates;


    public Employee(int baseSalary, String name, int NumberOfSubordinates) {
        BaseSalary = baseSalary;
        this.name = name;
        this.NumberOfSubordinates = NumberOfSubordinates;
    }

    public int getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        BaseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }
    protected int getValue (){
        return 3;
    }
    public abstract int getSalary();





}
