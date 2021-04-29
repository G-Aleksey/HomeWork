package HW.HW_C_1;

public class HW1_Uppercase {


    public static void main(String[] args) {

        System.out.println(
                abbrevName("Sam Harris")
        );

       }


    public static String abbrevName(String name) {
                 String[] names = name.split(" ");
                return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
            }


    public static String abbrevName2(String name) {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }


//        String abb ="";
//        for(int i=0; i<name.length(); i++){
//            char c = name.charAt(i);
//            if(c >= 97 && c <= 122) {
//
//            } else  c = name.charAt(i);
//            abb +=c;
//        }
//        //str.charAt(index)
//        return abb;
//    }


//       String abb ="";
//        for (int i = 0; i <name.length(); i++) {
//            if(name.charAt(i) == name.toUpperCase(i) ){
//                abb += name.charAt(i) + ".";
//
//            }
//
//        }
//        return abb;
//    }

    // assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
}
