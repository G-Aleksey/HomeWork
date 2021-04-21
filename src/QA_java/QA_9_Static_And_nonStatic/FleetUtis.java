package QA_java.QA_9_Static_And_nonStatic;

public class FleetUtis {

    static int ANNAUL_MILE = 20000;
    public static void printFleetData (Car[] fleet) {
        for (int i = 0; i < fleet.length ; i++) {
            System.out.println(fleet[i].getYear() + " " + fleet[i].getModel() + " ");
        }


    }

    public static double getAvaregeAge(Car[] fleet){
        int ageSum = 0;
        double result;
        for (int i = 0; i < fleet.length; i++) {
            ageSum += 2021- fleet[i].getYear();

        }
        result = (double) ageSum / fleet.length;
        return result;
    }

    public static double getFuelCost (Car[] fleet, double pricePerGalon){
        int cost = 0;
        for (int i = 0; i < fleet.length ; i++) {
            cost += ANNAUL_MILE / fleet[i].getMpg() * pricePerGalon;

        }

        return cost;
    }


}
