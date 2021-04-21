package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int age;
    private boolean hasHair;
    private String gender;
    private static int population = 0;

    private static String  planet = "Earth";


    public Person(String firstName, String lastName, String gender) {
        setFirstName(firstName);
        this.lastName = lastName;
        this.gender = gender;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, int birthYear, int birthMonth, int birthDay, String gender) {
        population += 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.gender = gender;


    }


    public static String getPlanet() {
        return planet;
    }

    public int getAge(){
        return 2021 - birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getFirstName() {
        String result;
        if (!(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))){
            return firstName;
        }
        if (gender.equalsIgnoreCase("male")){
            result = "Mr " + firstName;
        } else {
            result = "Mrs " + firstName;
        }
        return result;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isHasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getPopulation() {
        return population;
    }
}
