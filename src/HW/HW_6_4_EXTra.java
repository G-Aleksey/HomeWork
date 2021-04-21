package HW;

public class HW_6_4_EXTra {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int counts = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    System.out.println(array[i][j]);
                }
                counts++;
            }
            System.out.println(counts);
        }


//                String[][] array = {{"Привет", "всем", "кто"},
//                        {"изучает", "язык", "программирования"},
//                        {"java"}};
//                int count = 0;
//                for (int i = 0; i <array.length ; i++) {
//                    for (int j = 0; j < array[i].length; j++) {
//                        if (array[i][j].indexOf("е") == -1) {
//                            ++count;
//                        }
//                    }
//                } System.out.println(count);
            }
        }


