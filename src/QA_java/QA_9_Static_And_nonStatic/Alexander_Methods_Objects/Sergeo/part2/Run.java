package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects.Sergeo.part2;

public class Run {
    public static void main(String[] args) {
        Commertial commertial = new Commertial();
        commertial.buldingType();
        commertial.setNumberOfStoreys(98);
        commertial.setRoomsOfTheFloor(23);
        Owner owner = new Owner();
        owner.setLastName("Alex");

        System.out.println("Home type");
        System.out.println("Owner name " + owner.getLastName());
        System.out.println("КОличество этажей " + commertial.getNumberOfStoreys());
        System.out.println("КОличество помещений " + commertial.getRoomsOfTheFloor());
        System.out.println("_______________________________________________________");
            Residential residential = new Residential();
            residential.buldingType();
            residential.setNumberOfStoreys(12);
            residential.setRoomsOfTheFloor(2);
            Owner owner1 = new Owner();
            owner1.setLastName("Semen");


        System.out.println("Owner name " + owner1.getLastName());
        System.out.println("КОличество этажей " + residential.getNumberOfStoreys());
        System.out.println("КОличество помещений " + residential.getRoomsOfTheFloor());
    }
}
