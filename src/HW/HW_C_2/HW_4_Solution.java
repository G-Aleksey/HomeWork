package HW.HW_C_2;

import java.util.Arrays;

public class HW_4_Solution {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(stringToArray("Robin Singh")));


    }

    public static String[] stringToArray(String s) {
       String [] name = s.split(" ");
       return name;


    }
//assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
}
