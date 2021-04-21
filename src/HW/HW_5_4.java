package HW;

public class HW_5_4 {
    public static void main(String[] args) {
        int sum = 0;
        double element = 0;
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for (int i = 0; i < array.length; i++) {
            element += array[i].length;
            for (int j = 0; j <array[i].length ; j++) {
                sum += array[i][j];


            }

        }
        System.out.println(element);
        System.out.println(sum);
        System.out.println(sum/element);
    }
}

