package QA_java;

import java.util.Random;
import java.util.Scanner;

public class QA_3_3_java_HeadAndTails_Scaner {
    public static void main(String[] args) {
        int headOrtail;
        int yourguessNumber;
        String yourGuess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your guess: ");
        yourGuess = scanner.next();
        scanner.close();
        if (!yourGuess.equals("head") && !yourGuess.equals("tail")) {
            System.out.println("Try again, only head or tail");
            System.exit(0);
            }

        if (yourGuess.equals("head")) {
            yourguessNumber = 0;
        } else {
            yourguessNumber = 1;
        }

        headOrtail = new Random().nextInt(2);
        System.out.println(headOrtail);

        if (headOrtail == yourguessNumber) {
            System.out.println("Your Won");
        } else  {
                System.out.println("Your lost");
            }
        }
    }


