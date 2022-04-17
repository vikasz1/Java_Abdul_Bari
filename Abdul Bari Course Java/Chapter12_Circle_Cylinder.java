class Circle22{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
class Cylinder extends Circle{
    public double height;

    public double volume(){
        return area()*height;
    }
}




public class Chapter12_Circle_Cylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 7;
        c1.height = 10;
        System.out.println("Volume"+c1.volume());
        System.out.println("Area"+c1.area());
    }
}
