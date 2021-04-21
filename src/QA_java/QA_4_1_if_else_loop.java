package QA_java;

import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

public class QA_4_1_if_else_loop {
    public static void main(String[] args) {
     /*   String color = "black";
        if (color.equals("red")) {
            System.out.println("I can't go");
        } else if (color.equals("yellow")) {
            System.out.println("Ready to go");
        } else if (color.equals("gren")) {
            System.out.println("Go go go");
        } else {
        System.out.println("Trafick ");
        }
  */

   /*   int price = 5;
      int myMoney = 5;
      if (price > myMoney) {
          System.out.println("I go to work");
      } else if (price <= myMoney) {
          System.out.println("I buy buckwheat");
      }
      */

     /*   int a =  65612;
        if (a < 10 && a > -10) {
            System.out.println("It's one digit number");
        } else if (a < 100 && a > -100) {
            System.out.println(" It's two digit number");
        } else if (a < 1000 && a > -1000) {
            System.out.println(" It's thre digit number");
        } else if (a < 10000 && a > -10000) {
            System.out.println(" It's four digit number");
        } else {
            System.out.println(" The number is not beetwen looking number");
        }

      */

     //Вложенніе ціклі
//        1
//        22
//        333
//        4444
    /*
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        */

   /*     int y = 5;
        while ( y<= 25) {
            System.out.println(y);
            y++;
        }
*/

   /*
        int n = 10;
        do {
            System.out.println("print");
            n++;
        } while  (n <= 11);
        System.out.println("end");
*/

   /*
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("What your name");
        name = scanner.nextLine();

        int q = 1;
        while (q < 3) {
            System.out.println("Hello " + name);
            q++;
        }

    */
        // калькулятор
        /*
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num1 = scanner.nextInt();

        System.out.println("Enter operation");
        String operation = scanner.next();

        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        if (operation.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operation.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operation.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operation.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Your entel invalid operation");
        }

         */

        Scanner scanner = new Scanner(System.in);
        boolean snow, rain, sunny;
        int temp;
        String activity;

        System.out.println("Enter tempr");
        temp = scanner.nextInt();

        if (temp >= 40 && temp < 80) {
            System.out.println("Is it raining ?");
            rain = scanner.nextBoolean();
            if (rain) {
                activity = "watch a movie";
            } else {
                activity = "Go to walk";
            }
        } else if (temp >= 25 && temp < 40) {
            System.out.println("Is it snow ?");
            snow = scanner.nextBoolean();
            if (snow) {
                activity = "make a snowman";
            } else {
                activity = "Learn java";
            }
        } else if (temp >=80) {
                System.out.println("It's sunny");
                sunny = scanner.hasNextBoolean();
                if (sunny) {
                    activity = "go swiming to beach";
                } else {
                    activity = "learn java";
                }
            } else {
                System.out.println("enter valid temp");
                activity = "Unknow";
           }
        System.out.println("My activity " + activity);

    }
}
