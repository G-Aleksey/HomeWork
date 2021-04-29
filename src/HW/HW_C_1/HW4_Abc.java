package HW.HW_C_1;

public class HW4_Abc {
    public static void main(String[] args) {

        System.out.println(
                position('a'));

    }
        public static String position(char alphabet)
        {
            return "Position of alphabet: " + ((int) alphabet - 96);
        }

}
//assertEquals("Position of alphabet: 1", Kata.position('a'));