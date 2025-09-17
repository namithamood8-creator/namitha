package methodoverloading;
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
        name = "Unknown";
        id = 0;
        salary = 0.0;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        salary = 0.0;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class constuctor {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice", 101);
        Employee e3 = new Employee("Bob", 102, 50000);

        e1.display();
        e2.display();
        e3.display();
    }
}