package QA_java;

import java.util.Arrays;

public class QA_5_1_array_sum_sout {

    public static void main(String[] args) {


        int [] arr = new int[8];
  //      Arrays.fill(arr, 5); - заполнение значений
        System.out.println(arr.length);

        int sum =0;
        for (int i = 0; i < arr.length; i = i + 1) {
            arr[i] = i;
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(sum);

    //    int[] arr = new int[]{1, 2, 3, 4, 5};
  //     int[] numbers = {1, 2, 3, 4, 5};
   //     System.out.println(Arrays.toString(arr));
    }
}
