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

    public void showWork() {
        super.work();
        work();
    }
}

public class superkey {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.showWork();
    }
}
