package HW.HW_C_1;

public class HW_5_Sum {
    public static void main(String[] args) {
        System.out.println(
                arrayPlusArray(new int[] {1,2,3}, new int[] {4,5,6}));
    }
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int[][] array = {arr1, arr2};
        int sum= 0;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                sum +=array[i][j];
            }

        }
        return sum;
    }
}
// assertEquals(21, Sum.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));