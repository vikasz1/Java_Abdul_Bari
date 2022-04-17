
class Rectangle {
    private int length;
    private int breadth;

    public int getlength() {
        return length;
    }
    public int getbreadth(){
        return breadth;
    }

    public void setLength(int a) {
        if (a>0)  length = a;
        else length = 0;
    }
    public void setBreadth(int a){
        if (a>0) breadth = a;
        else breadth = 0;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        }
        return false;
    }
}

public class Chapter11_Practice_Rectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        // r1.length = 5;
        // r1.breadth = 5;
        r1.setLength(-5);
        r1.setBreadth(4); 
        
        System.out.println(r1.area());
        System.out.println(r1.isSquare());
    }
}
