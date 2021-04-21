package HW.HW_7;

public class HW_7_2 {
    public static boolean isLove(final int flower1, final int flower2) {
        if ((flower1 + flower2) % 2 != 0 ) {
            return true;
        } else
            return false;

    }



    public static void main(String[] args) {
        System.out.println(isLove(2, 1));
    }
}
