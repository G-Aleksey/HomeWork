package HW;

public class HW_6_2 {
    public static void main(String[] args) {
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='е') {
                count += 1;
            }

        }
        System.out.println(count);
    }
}
