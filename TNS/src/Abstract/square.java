package Abstract;


class square extends Shape {
    private float side;

    square(float side) {
        this.side = side;
    }

    public void calArea() {
        area = side * side;
    }
}

class Rectangle extends Shape {
    private float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calArea() {
        area = length * breadth;
    }
}



