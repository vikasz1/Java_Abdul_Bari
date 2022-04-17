class Rectangle_this{
    int length,breadth;
    public Rectangle_this(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void display(){
        System.out.println(length);
        System.out.println(breadth);

    }
}



public class Chapter12_This_keyword {
    public static void main(String[] args) {
        Rectangle_this rt = new Rectangle_this(10, 5);
        rt.display();
    }
}
