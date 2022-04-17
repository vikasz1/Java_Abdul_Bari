class Circle {
    double radius;

    public double area(int radius) {
        return Math.PI * radius * radius;
    }

    public double perimeter(int radius) {
        return 2 * Math.PI * radius;
    }
}

public class Chapter11_Practice_Circle {
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.area(7));
        System.out.println(obj.perimeter(7));
    }
}
