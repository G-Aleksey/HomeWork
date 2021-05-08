package QA_java.QA_17_Generics_Collection;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {





        Queue<String> queue = new LinkedList<>();

        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("one");


        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("one", 11);




        List<String> list4 = new ArrayList<>();
        list4.add("one");

        List<String> list5 = new LinkedList<>();
        list5.add("one");
        list5.add("two");


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
     //   list.add(1);

        ArrayList<Integer> list2 = new ArrayList<>();
    //    list.remove(0);
        list2.add(1);
        list2.add(12354);


        ArrayList<String> list3 = new ArrayList<>();
        list3.add("tree");
        list3.add("four");

        list1.addAll(list3);

        list1.contains("two");
      //  System.out.println(list1.contains("two"));
      //  System.out.println(list1);

        for (String item : list1) {
        //    System.out.println(item);
        }


        List<String> l = Arrays.asList("one", "two");
       // List<String> l1 = new ArrayList<>(List.of("one", "two"));
        l.add("three");


        String[] arr = l.toArray(new String[0]);



        List<Integer> li = list1.stream().map(String::length).collect(Collectors.toList());
        System.out.println(li);

//        for (Integer item : list2) {
//            System.out.println(item);
//        }


    }
}
