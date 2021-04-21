package HW.HW_8;

import java.util.Random;

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
//        int fit1 = fighter1.health / fighter2.damagePerAttack;
//        int fit2 = fighter2.health / fighter1.damagePerAttack;
//
//        if (firstAttacker.equals(fighter1.name)) {
//            if (fit1 >= fit2) {
//                return fighter1.name;
//            } else
//                return fighter2.name;
//        } if (firstAttacker.equals(fighter2.name)) {
//            if (fit2 >= fit1) {
//                return fighter2.name;
//            } else {
//                return fighter1.name;
//            }
//        }

        int moves1 = (int) Math.ceil( (double)fighter2.health / fighter1.damagePerAttack);
        int moves2 = (int) Math.ceil( (double)fighter1.health / fighter2.damagePerAttack);
        if (moves1 > moves2) {
            return fighter2.name;
        } else if (moves1 < moves2) {
            return fighter1.name;
        } else {
            return firstAttacker;
        }
    }
}




