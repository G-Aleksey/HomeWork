package HW.HW_10;

public final class Manager extends BaseEmployee {
   private int worker;

    public Manager(String name, int age, char sex, int salaryOfDay, int worker) {
        super(name, age, sex, salaryOfDay);
        this.worker = worker;
    }

    public int getWorker() {
        return worker;
    }

    public void setWorker(int worker) {
        this.worker = worker;
    }


    @Override
    public int getSalary(Month[] monthArray) {
//        return super.getSalary(monthArray) + (int)(super.getSalary(monthArray) * (getWorker() * 0.01);
        int result = super.getSalary(monthArray);
        result += result * (getWorker() * 0.01);
        return result;
    }
}
