package HW.HW_17_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW_1 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("White");
        list1.add("Tan");
        list1.add("Yellow");
        list1.add("Orange");
        list1.add("Red");
        list1.add("Pink");
        list1.add("Purple");
        list1.add("Blue");
        System.out.println(list1);

        for (int i = list1.size()- 1; i >=  0; i--) {
            if(list1.get(i).contains("l")) {
                list1.remove(i);
            }
        }
        System.out.println(list1);


//        Iterator<String> list1Iterator = list1.iterator();
//        while (list1Iterator.hasNext()) {
//            String color = list1Iterator.next();
//            if (color.contains("l")) {
//                list1Iterator.remove();
//            }
//        }


          }
    }

