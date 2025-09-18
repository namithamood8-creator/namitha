package Abstract;

public abstract class Shape {
    protected float area;

    public abstract void calArea();

    public void show() {
        System.out.println("The area of shape is: " + area);
    }
}