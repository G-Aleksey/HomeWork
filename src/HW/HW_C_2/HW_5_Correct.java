package HW.HW_C_2;

public class HW_5_Correct {
    public static void main(String[] args) {
        System.out.println(
                correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N")
        );

    }



        public static String correct(String string) {
        String result = "";

                 result = string.replace('5', 'S').replace('0', 'O').replace('1', 'I');

                return result;

        }
}

//S is misinterpreted as 5
//O is misinterpreted as 0
//I is misinterpreted as 1