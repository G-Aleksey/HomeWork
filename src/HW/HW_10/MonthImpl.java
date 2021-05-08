package HW.HW_10;

public class MonthImpl implements IMonth {
    private String nameMonth;
    private final int countDay;
    private final int countWorkDay;




    public MonthImpl(String nameMonth, int countDay, int countWorkDay) {

        this.nameMonth = nameMonth;
        this.countDay = countDay;
        this.countWorkDay = countWorkDay;
}
    @Override
    public String getNameMonth() {
        return null;
    }

    @Override
    public int getCountDay() {
        return 0;
    }

    @Override
    public int getCountWorkDay() {
        return 0;
    }
}


