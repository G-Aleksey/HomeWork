package HW.HW_17_List;

import java.util.ArrayList;

public class HW__2 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 100; i <=1000 ; i++) {
            list.add(i);


            }
        for (Integer i = 0; i <list.size() ; i++) {
            if (list.get(i) % 2 == 0) {
                list.remove((int)i);
        }
        }
        System.out.println(list);

    }
}
