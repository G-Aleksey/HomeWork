package QA_java.QA_19_Irina_Generics;

public class Generics {
    public static <T> void printArray (T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

       Integer[] arrayInt = new Integer[]{1, 2 ,3 ,4 ,5};
        String[] arrayString = new String[]{"one", "two", "three", "four", "five"};
        Double[] arrayDouble = new Double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        int[] arrayInt1 = new int[]{6, 7, 8, 9, 10};
        printArray(arrayInt);
        printArray(arrayString);
        printArray(arrayDouble);
      //  printArray(arrayInt1);

    }
}
