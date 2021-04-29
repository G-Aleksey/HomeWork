package HW.HW_11;

public final class Worker extends Employee {


    public Worker(int baseSalary, String name, int NumberOfSubordinates) {
        super(baseSalary, name, NumberOfSubordinates);
    }
    public int getSalary() {
        return this.getBaseSalary();
    }

    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }
}
