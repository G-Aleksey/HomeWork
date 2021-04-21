package QA_java;

import java.util.Arrays;

public class QA_5_2_array_biggest_value {
    public static void main(String[] args) {
        /*
        int[] arr = {-2, -9, -5, -8, -3, -4, -1};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println(min);

         */
      //  int [][] twoDArray = {{0, 1}, {3, 4}}; Двухмерные
      /*
        int[] a = {4, 5, 6};
        int[] b = {8, 9};
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < result.length; i++) {
            if (i < a.length) {
                result[i] = a[i];
            } else {
                result[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(result));

       */




        String a = "abc";
        String b = "ab";
        b += 'c';
        System.out.println(a );
        System.out.println(b);
        //System.out.println(a == b);            false
        System.out.println(a.equals(b));
    }
}

