package HW_2;

public class HW_6_3 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
       String s2 = s.toLowerCase();
       int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ( s2.charAt(i) == 'р' && s2.charAt(i+1) == 'и' && s2.charAt(i+2) == 'т') {
                count++;
            }
        }
        System.out.println(count);
    }

}


