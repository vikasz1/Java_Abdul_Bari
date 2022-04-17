abstract class Super_Shape {
    abstract void perimeter();
    abstract void area();
}

class Circle_Shape extends Super_Shape {
    int radius;

    Circle_Shape(int radius) {
        this.radius = radius;
    }

    void perimeter() {
        System.out.println(2 * Math.PI * radius);
    }

    void area() {
        System.out.println(Math.PI * radius * radius);
    }
}

class Rectangle_Shape extends Super_Shape {
    int length, breadth;

    Rectangle_Shape(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void perimeter() {
        System.out.println(2 * (length+breadth));
    }

    void area() {
        System.out.println(length*breadth);
    }
}

public class Chapter13_Student_challenge {
    public static void main(String[] args) {
        Super_Shape s = new Circle_Shape(56);
        s.perimeter();
        Super_Shape rs = new Rectangle_Shape(2, 5);
        rs.area();
    }
}
