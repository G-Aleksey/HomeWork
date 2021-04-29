package HW.HW_10;

public final class Month {

    private final String nameMonth;
    private final int countDay;
    private final int countWorkDay;

    public Month(String nameMonth, int countDay, int countWorkDay) {
        this.nameMonth = nameMonth;
        this.countDay = countDay;
        this.countWorkDay = countWorkDay;
    }

    public String getNameMonth() {
        return nameMonth;
    }

//    public void setNameMonth(String nameMonth) {
//        this.nameMonth = nameMonth;
//    }

    public int getCountDay() {
        return countDay;
    }

//    public void setCountDay(int countDay) {
//        this.countDay = countDay;
//    }

    public int getCountWorkDay() {
        return countWorkDay;
    }

//    public void setCountWorkDay(int countWorkDay) {
//        this.countWorkDay = countWorkDay;
//    }

//    public static Month returnKvartal1 (Month[] monthArray) {
//        for (int i = 0; i < 3; i++) {
//            if (monthArray.length > 3){
//
//            }
//            return Month[] monthArray;
//        }
//    }
}
