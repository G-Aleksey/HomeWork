package QA_java.QA_19_Irina_Generics;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Class_ArrayList {
    public static void main(String[] args) {

             List<String> list = new ArrayList<>();

       Collection<String> collection = new ArrayList<>();


//        java.lang.Iterable<String> iterable = list;
//        java.lang.Iterable<String> iterable1 = collection;

        //iterable.forEach();

        collection.add("collection");
        list.add("list");
        list.add("Two");


        System.out.println(collection);
        System.out.println(list);
        collection = list;
        System.out.println(collection);
    }
}
