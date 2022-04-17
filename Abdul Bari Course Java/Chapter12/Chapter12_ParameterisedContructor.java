class Rectangle22{
    int length, breadth;
    public Rectangle22(){
        length = breadth = 1;
    }
    public Rectangle22(int l, int b){
        this.length = l;
        this.breadth = b;
    }
}
class Cuboid extends Rectangle{
    int height;

    public Cuboid(){
        height = 1;
    }
    public Cuboid(int h){
        this.height  = h;
    }

    public Cuboid(int l,int b,int h){
        super(l, b);
        height = h;
    }


    public int volume(){
        return length*breadth*height;
    }

}

public class Chapter12_ParameterisedContructor {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(); // This will non param Constructor of both parent and child
        Cuboid c2 = new Cuboid(10); // This will non param Constructor of pchild and param cosnt of parent
        Cuboid c3 = new Cuboid(4,2,3);
        System.out.println(c1.volume());
        System.out.println(c2.volume());
        System.out.println(c3.volume());

    }
}
