package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects.Sergeo.part2;

public class Residential extends RealEstate{

    String  homeType;

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    @Override
    public void  buldingType() {
        System.out.println("Home");
    }
}
