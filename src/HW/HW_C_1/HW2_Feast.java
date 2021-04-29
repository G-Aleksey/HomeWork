package HW.HW_C_1;

public class HW2_Feast {
    public static void main(String[] args) {


        System.out.println(
                feast("great blue heron","garlic nann")
        );

    }

    public static boolean feast(String beast, String dish) {
      return           beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);


    }
   // assertTrue(Kata.feast("great blue heron","garlic nann"));
}
