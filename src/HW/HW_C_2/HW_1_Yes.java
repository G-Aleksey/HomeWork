package HW.HW_C_2;

public class HW_1_Yes {
    public static String boolToWord(String b)
    {
//        {
//            return b ? "Yes" : "No";
//        }
        if (b=="Yes") {
            return "true";
        } else
            return "false";
    }

    public static void main(String[] args) {
        System.out.println(
                boolToWord("Yes")
        );
    }
}
