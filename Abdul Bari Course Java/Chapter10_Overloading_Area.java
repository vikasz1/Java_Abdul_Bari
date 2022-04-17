public class Chapter10_Overloading_Area {

    static double area(double l,double b){
        return l*b;
    }
    static double area(double r){
        return 3.14*r*r;
    }
    static double area(double a,double b,double h) {
        return (0.5*h*(a+b));
    }
    public static void main(String[] args) {
        //Calculate area
        System.out.println(area(3, 2));
        System.out.println(area(1,2,5));

    }
}
