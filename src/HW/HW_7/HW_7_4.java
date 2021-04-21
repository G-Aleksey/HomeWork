package HW.HW_7;

public class HW_7_4 {
    public static int findSmallestInt(int[] args) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }

        return min;

    }


    public static void main(String[] args) {
        int[] array = {78,56,232,12,11,-7};
        System.out.println(findSmallestInt(array));

    }
}
