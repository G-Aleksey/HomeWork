package HW.NEW.HW;

import java.util.ArrayList;

public class Average {
    public static void main(String[] args) {

        Integer result = 0;
        Integer sum = 0;
        Integer[] array = new Integer[]{125, 25, 35, 15};
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        result = sum / array.length;
        System.out.println(result);
    }
   }

