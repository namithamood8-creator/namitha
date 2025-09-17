package finalkeyword;
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display(int id) {
        System.out.println("Local id: " + id);
        System.out.println("Instance id: " + this.id);
        System.out.println("Name: " + name);
    }
}

public class finalkey {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice");
        s1.display(999);
    }
}