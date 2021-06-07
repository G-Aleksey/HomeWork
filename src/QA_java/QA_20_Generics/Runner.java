package QA_java.QA_20_Generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("hello");
        list.add(12);
        list.add('c');

        String s = (String) list.get(0);


    }

}
