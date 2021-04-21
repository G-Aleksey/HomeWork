package QA_java;

public class QA_3_1_java_if_else {
    public static void main(String[] args) {
      /*  int myAge = 34;
        int sisterAge = 35;
        if (myAge == sisterAge) {
            System.out.println("me and my sister are the same age");
        } else if (myAge > sisterAge) {
                System.out.println("i'm  older sister");
            } else {
                System.out.println("Я младше сестрі");
            }

       */
        int a = 5;

        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("Ваше число четное");
                if (a % 4 == 0) {
                    //4,8
                    if (a > 5) {
                        System.out.println("8");
                    } else {
                        System.out.println("4");
                    }
                } else if (a * 3 == 6) {
                    System.out.println("2");
                    //2,6,10
                } else if (a == 10) {    //6, 10
                    System.out.println("10");
                } else {
                    System.out.println("6");
                }
            } else if (a % 3 == 0) {   //1 ,3 ,5 ,7 ,9
                // 3, 9
                if (a == 3) {
                    System.out.println("3");

                } else {
                    System.out.println("9");
                }

            } else if (a != 7) {   //1 , 5, 7

                if (a == 5) {
                    System.out.println("5");
                } else {
                    System.out.println("1");
                }
            } else {
                System.out.println("7");
            }
        } else {
            System.out.println("Ваше число 0");
        }
    }

}



