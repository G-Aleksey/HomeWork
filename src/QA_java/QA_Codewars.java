package QA;
import java.util.Arrays;

public class QA_Codewars {

    public static String twoSort(String[] s) {
       // System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        String [] firstWordArray = s[0].split("");
        String result = "";
        for (int i = 0; i < firstWordArray.length; i++) {
            result += firstWordArray[i];
            if (i < firstWordArray.length -1) {
                result += "***";
            }

        }
      //  System.out.println(Arrays.toString(s));
        return result;

        //public class SortAndStar {
        //
        //    public static String twoSort(String[] s) {
        //        java.util.Arrays.sort(s);
        //                                                       краткое решение
        //        return String.join("***",s[0].split(""));
        //    }
        //}


    }

    public static void main(String[] args) {

        System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
            // "b***i***t***c***o***i***n"
    }
}

