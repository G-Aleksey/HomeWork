package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects.Sergeo;

public class Ticket extends Person {
    private double price;

    public double getPrice() {
        if(age <= 1) {
            price =0;
        } else if (age <= 6){
            price *= 0.5;
        }  else if (age >= 55 && age < 120 ) {
            price *= 0.8;
        } else if (age > 120){
            System.out.println("Enter valid age");
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
