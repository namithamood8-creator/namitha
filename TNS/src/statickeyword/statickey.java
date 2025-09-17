package statickeyword;

class StaticDemo {
    static int count;
    static double interestRate;

    static {
        count = 0;
        interestRate = 7.5;
        System.out.println("Static block executed");
    }

    public StaticDemo() {
        count++;
        System.out.println("Constructor called, count: " + count);
    }

    static void display() {
        System.out.println("Count: " + count);
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class statickey {
    public static void main(String[] args) {
        StaticDemo.display();

        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        StaticDemo.display();
    }
}