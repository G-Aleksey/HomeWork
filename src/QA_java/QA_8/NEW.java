package QA_java.QA_8;

public class NEW {
    public static void main(String[] args) {
        Kitty kitty = new Kitty();
        kitty.name = "Bob";
        kitty.getCallMammy();

        System.out.println(kitty.name);
        System.out.println(kitty.callMammy);
        System.out.println(kitty.getCallMammy());

        Kitty kitty1 = new Kitty();
        kitty1.name = "Sam";
        System.out.println(kitty1.name);

        Dog dog = new Dog();
        dog.name = "Fffff";
        dog.voice();
    }
}
