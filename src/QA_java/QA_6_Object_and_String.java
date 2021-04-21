package QA_java;

public class QA_6_Object_and_String {
    public static void main(String[] args) {
        String str = "123";
        int[] arr = null;

        for (int i = 0; i <str.length() ; i++) {

            System.out.println(str.charAt(i));

        }
String ss = "sergey";
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == 'e') {
                System.out.println(i);
            }

        }

//        System.out.println(ss.indexOf('e'));
//
//        String srt = ss.replace('e', 'x').replace('g', 'j');   двойная замена
//        System.out.println(srt);

        String[] animals = {"Хаски","Морж"};// массив строк 1
        String[] food = {"колбаски","корж"}; // массив строк 2

//составляем строки из элементов массивов и связующего слова
        String result1 = animals[0].concat(" ест ").concat(food[0]);
        String result2 = animals[1].concat(" ест ").concat(food[1]);

//выводим на консоль
        System.out.println(result1);
        System.out.println(result2);


        String strr = "1 000 000 000";
//преобразовываем строку в массив
        char[] chArray = strr.toCharArray();
//перебираем все элементы массива
        for(int i = 0; i<chArray.length; i++){
            //находим пробел
            if(chArray[i] == ' '){
                //заменяем на точку
                chArray[i] = '.';

            }
        }
//выводим результат
        System.out.println(chArray);


    }



}
