package HW.HW_7;

public class HW_7_5 {

    public static String countingSheep(int num) {

        String print = "";
        for (int i = 1; i <= num; i++) {
            print += (i) + " sheep...";
        }
            return print;
    }

        public static void main (String[]args){
            System.out.println(countingSheep(3));


        }
    }


//    public static String countingSheep(int num) {
//        //Add your code here
//        for (int i = 1; i <= num; i++) {
//            return i +  " sheep...";
//
//        }
//    }
//}