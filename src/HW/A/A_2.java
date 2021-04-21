package HW.A;

public class A_2 {
    public static String remove(String str) {
       String rest =  str.substring( 1, str.length() - 1 );


        return rest;

              }

    public static void main(String[] args) {
        System.out.println(remove( "eloquent"));

}
}
