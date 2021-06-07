package QA_java.QA_20_Generics;

public class GenericsRunner {
    public static void main(String[] args) {

        GenericsBox<String, Integer> box1 = new GenericsBox<>();
        GenericsBox<Integer, Integer> box2 = new GenericsBox<>();

        box1.setItems("Java for");
        box1.setItems("Java for 1");
        box1.setItems("Java for 2");

        box2.setItems(100);
        box2.setItems(200);
        box2.setItems(300);


        box1.setBoxSize(56);


        System.out.println(box1.getBoxSize());
        System.out.println(box2.getBoxSize());
    }
}
