package QA_java.QA_8;

public class Cat extends Animal {
    String name;
    String color;
    String catBreed;

    @Override
    public  void voice() {
        System.out.println("Myaaaa");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
