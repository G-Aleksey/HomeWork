package HW.HW_C_2;

import java.util.Arrays;

public class HW_3_Sequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        int[] randoms = new int[n];
        for (int i = 0; i < n; i++) {
           randoms[i] = n-i;
        }
        return randoms;
    }
//        int result = 0;
//        for (int i = 0; i <= n ; i++) {
//       result = result + (n - i);
//       //  new int [result];
//        }
//        return new int[result];
//    }

// assertArrayEquals(new int[]{5,4,3,2,1},Sequence.reverse(5));

}