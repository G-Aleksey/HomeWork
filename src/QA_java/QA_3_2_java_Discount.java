package QA_java;

//if totol more 500 10%
//if totol more 1000 15%
public class QA_3_2_java_Discount {
    public static void main(String[] args) {
        double cartTotal = 1001;
        double totalPay;
        if (cartTotal > 500 && cartTotal < 1000) {
            System.out.println("Discount 10%");
            totalPay = cartTotal * 0.9;
        } else if (cartTotal > 1000) {
            System.out.println("Discount 15%");
            totalPay = cartTotal * 0.85;
        } else {
            totalPay = cartTotal;
        }
        System.out.println("Your total: " + totalPay);

    }
}
