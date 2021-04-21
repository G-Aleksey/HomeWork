package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects.Sergeo.part2;

public class RealEstate {

    int numberOfStoreys;
    int roomsOfTheFloor;


    public int getNumberOfStoreys() {
        return numberOfStoreys;
    }

    public void setNumberOfStoreys(int numberOfStoreys) {
        this.numberOfStoreys = numberOfStoreys;
    }

    public int getRoomsOfTheFloor() {
        return roomsOfTheFloor;
    }

    public void setRoomsOfTheFloor(int roomsOfTheFloor) {
        this.roomsOfTheFloor = roomsOfTheFloor;
    }
    public void buldingType(){
        System.out.println("Reel Estate");
    }

}
