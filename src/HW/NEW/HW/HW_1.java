package HW.NEW.HW;

public class HW_1 {
    public static void main(String[] args) {

   printSum(125, 35);

   Integer[] numbers = new Integer[]{125, 25, 35, 15};
   averageNumber(numbers);

   table();

    int[] asd = new int[]{1,2,3,4,5,6};
    numbers(asd,4);
    int[] asd2 = new int[]{1, 2, 3, 4, 5};
    print(asd);
    print(asd2);

    int[] asd3 = new int[]{2, 6, 20};
    Double(asd3);

    int[] asd4 = new int[]{1, -6, -5, 3, 4};
    zero(asd4);

    int[] asd5 = new int[]{ 22, -23,  24,  -25,  26,  -27,  28};
    negative(asd5);

    int[] asd6 = new int[]{1, 6, 9, 12};
    int[] asd7 = new int[]{1, 8, 10, 1, 20};
    sequence(asd6);
    sequence(asd7);
    }

    public static void printSum(int a, int b){
        //Написать метод, который принимает на вход 2 числа и распечатывает сумму.
        //Пример:
        //method(125, 25)
        //Распечатать:
        //125 + 25 = 150
           System.out.println(a + " + " + b + " = " + (a+b));
        }

    public static void averageNumber(Integer[] array){
        //Написать метод, который принимает массив чисел и печатает их среднее:
        //Пример:
        //method( {125, 25, 35, 15} )
        //Распечатать:
        //Numbers: 125, 25, 35, 15
        //Average: 50

        int result = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        result = sum / array.length;
        System.out.print("Numbers:");
        for (int i = 0; i <array.length -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array.length - 1);
        System.out.println("Average: " + result);
    }

    public static void print(int[] array) {
        //Написать метод, который принимает массив чисел и печатает вторую половину массива
        //Пример: {1, 2, 3, 4, 5, 6}
        //Распечатать: 4, 5, 6
        //Пример: {1, 2, 3, 4, 5}
        //Распечатать: 4, 5
        int startindex = ((array.length + 1) / 2);
        for (int i = startindex; i <array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }


    public static void table(){
        //Необходимо вывести на экран таблицу умножения на 3:
        //3*1=3
        //3*2=6
        //3*3=9
        //3*4=12
        //3*5=15
        //3*6=18
        //3*7=21
        //3*8=24
        //3*9=27
        //3*10=30
        int a = 3;
        int result = 0;
        for (int i = 0; i <= 10 ; i++) {
            result = a * i;
            System.out.println(a + "*" + i + "=" + result);

        }
    }

    //Дан массив int[] и любое число.
    //В этом массиве нужно найти индексы двух чисел, сумма которых будет равна этому числу.
    //Например, массив выглядит следующим образом {1,2,3,4,5,6}; число = 4.
    //Вывод должен быть [0, 2], потому что под индексом 0 стоит 1, а под индексом 2 - цифра 3.
    public static void numbers(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[i] + array[j]) == a) {
                    System.out.println(i + ", " + j);
                }
            }
        }
    }

    public static int[] Double (int[] array) {
        //Написать метод, который принимает массив чисел и возвращает массив, в котором все числа умножены на 2:
        //	Пример:
        //	method( {2, 6, 20} )
        //	Возвращается: {4, 12, 40}
        for (int i = 0; i <array.length-1; i++) {
            System.out.print(array[i] * 2 + ", ");
        }
       System.out.println(array[array.length-1] * 2);
    }

    public static void zero(int[] array) {
        //Написать метод, который принимает на вход массив, и возвращает массив, в котором все отрицательные числа заменены на 0.
        //Пример:
        //Массив на вход: {1, -6, -5, 3, 4}
        //Возвращаемый массив: {1, 0, 0, 3, 4}
        for (int i = 0; i < array.length - 1; i++) {
            while (array[i] < 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static void negative(int[] array) {
        //Написать метод, который возвращает количество отрицательных элементов массива
        //Пример:
        // { 22, -23,  24,  -25,  26,  -27,  28}
        //Возвращает: 3
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void sequence(int[] array) {
        //Написать метод, который возвращает true,  если массив - возрастающая последовательность чисел. Иначе, возвращает false
        //Пример:
        //{1, 6, 9, 12} —> true
        //{1, 8, 10, 1, 20} —> false
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i + 1]) {
            }
        }
            System.out.print("true");


    }

}
