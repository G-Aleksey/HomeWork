package QA_java.QA_9_Static_And_nonStatic;

public class Fleet {

    public static void main(String[] args) {
        Car camry = new Car("Camry", 2021, 32);
//        camry.setModel("Camry");
//        camry.setYear(2021);
//        camry.setMpg(32);

        Car corolla = new Car("Corolla", 2015, 35);
        Car tacoma = new Car("Tacoma", 2016, 20);
        Car prius = new Car("Prius", 2010, 50);

        Car[] fleet = {camry, corolla, tacoma, prius};

        FleetUtis.printFleetData(fleet);
        double avAge = FleetUtis.getAvaregeAge(fleet);
        System.out.println("Avarege car " + avAge);
        double fuelCost = FleetUtis.getFuelCost(fleet, 3.75);
        System.out.println("Fuel coast " + fuelCost);

    }
}
