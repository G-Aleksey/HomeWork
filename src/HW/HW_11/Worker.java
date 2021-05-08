package HW.HW_11;

public class Worker implements IEmployee {
    private int BaseSalary;
    private String name;


    public Worker(int baseSalary, String name) {
        BaseSalary = baseSalary;
        this.name = name;

    }

    public int getSalary() {
        return this.getBaseSalary();
    }

    @Override
    public final int getBaseSalary() {
        return this.getBaseSalary();
    }

    @Override
    public void setBaseSalary() {

    }

    @Override
    public String getName() {
        return name;
    }


}
