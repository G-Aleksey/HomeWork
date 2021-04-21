package QA_java.QA_9_Static_And_nonStatic.Alexander_Methods_Objects.Sergeo;

public class BuyTicket {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        ticket.setName("Alex");
        ticket.setSex('m');
        ticket.setPrice(100);
        ticket.setAge(130);

        System.out.println("Ticket for " + ticket.getName() + " " + ticket.getPrice());


        System.out.println("++++++++++++++++++++++++++++++++++++++");


        Ticket ticket2 = new Ticket();
        ticket2.setName("Alexandra");
        ticket2.setSex('f');
        ticket2.setPrice(100);
        ticket2.setAge(30);

        System.out.println("Ticket for " + ticket2.getName() + " " + ticket2.getPrice());



    }



}
