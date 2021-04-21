package QA_java;

public interface QA_6_1_7_1_2DArray {
    public static void main(String[] args) {
        String[] catsName = new String[8];
        catsName[0] = "Мурзик";
        catsName[1] = "BArsik";
        catsName[2] = "Sonya";
        catsName[3] = "Asay";
        catsName[4] = "Rugik";
        catsName[5] = "Bonay";
        catsName[6] = "Cotic";
        catsName[7] = "Ramik";
//        for (int i = 0; i < catsName.length; i++) {
//            System.out.println(catsName[i]);
//        }
//        for (int boxNumber = 0; boxNumber <= 7; boxNumber ++) {
//            System.out.println(catsName[boxNumber]);

        int[] catAges = {2, 3, 4, 5, 6, 7, 9, 10};
        int min = 100;
        for (int i = 0; i < catAges.length; i++) {
            if (catAges[i] < min) {
                min = catAges[i];
            }
        }
 //       System.out.println(min);


        String[] catsAgesString = new String[8];
        for (int i = 0; i < catAges.length; i++) {
            catsAgesString[i] = String.valueOf(catAges[i]);
     //       System.out.println(catsAgesString[i]);

        }
        System.out.println(catsAgesString[0].getClass());

        String[][] cats = new String[2][8];
        for (int i = 0; i < cats.length; i++) {
            for (int j = 0; j < cats[i].length; j++) {
                if (i == 0) {
                    cats[i][j] = catsName[j];
                } else if (i == 1) {
                    cats[i][j] = catsAgesString[j];
                }
                System.out.println(cats[i][j]);
            }

        }

        for (int i = 0; i < cats[i].length; i++) {
            for (int j = 0; j < cats.length; j++) {
                System.out.println();
                System.out.println(cats[i][j]);
                System.out.println();
            }
            System.out.println("_____________________");

            System.out.println(cats[0][4] + ", " + cats[1][4]) ;
        }
    }


    }



