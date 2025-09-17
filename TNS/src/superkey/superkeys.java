package superkey;

class Employee {
    public void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer is coding");
    }

    public void showParentWork() {
        super.work();
    }
}

public class SuperKeys {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.showParentWork();
    }
}
