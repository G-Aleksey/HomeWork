package HW.HW_11;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker(80, "Sam");
        Manager manager = new Manager(100, "DEN",3);
        Manager manager1 = new Manager(100, "DEN",5);
        Manager manager2 = new Manager(100, "DEN",8);
        Manager manager3 = new Manager(100, "DEN",7);
        Director director = new Director(1000, "Rem", 9);

        System.out.println(worker.getSalary());
        System.out.println(manager.getSalary());
        System.out.println(director.getSalary());

        Employee[] employee = {manager, director};
        Manager[] managers = {manager, manager1, manager2, manager3};

        System.out.println(Utils.searchName("SEM", employee));
        System.out.println(Utils.findSubName("em", employee));
        System.out.println(Utils.allSalary( employee));
        System.out.println(Utils.minSalary( employee));
        System.out.println(Utils.maxSalary( employee));
        System.out.println(Utils.minWorker(managers));
        System.out.println(Utils.maxWorker(managers));
    }
}
