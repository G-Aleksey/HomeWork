package HW.HW_11;

public final class  Director extends Employee {

//    public Director(int baseSalary, String name, int numberOfSubordinates) {
//        super(baseSalary, name, numberOfSubordinates);
//    }


    public Director(int baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);

    }

    @Override
    protected int getValue() {
        return 9;
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
