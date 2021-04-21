package HW.HW_11;

public final class Manager extends Employee {



    public Manager(int baseSalary, String name, int NumberOfSubordinates) {
        super(baseSalary, name, NumberOfSubordinates);

    }




    @Override
    public int getSalary() {
        int result = super.getBaseSalary();
        if(getNumberOfSubordinates() > 0){
            result += (int)result * (getNumberOfSubordinates() / 100.0 * getValue());
            return result;
        } else

        return result;
    }
}
