package methodoverloading;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10.5, 20.5));
        calc.display("Alice", 25);
        calc.display(30, "Bob");
    }
}