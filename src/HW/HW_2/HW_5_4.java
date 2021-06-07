package HW.HW_2;

public class HW_5_4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        double len = 0;
        for (int i = 0; i < array.length; i++) {
            len += array[i].length;
            for (int j = 0; j < array[i].length; j++) {

                sum = sum + array[i][j];
            }
        }
        System.out.println(len);
        System.out.println(sum);
       System.out.println(sum / len);


//       int[] qa = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < qa.length; i++) {
//
//        }
//        System.out.println(Arrays.toString(qa));
    }

}
