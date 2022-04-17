
class Rectange2{
    private int length;
    private int breadth;

    public Rectange2(){
        length = 1;
        breadth = 1;
        
    }
    public Rectange2(int a,int b){
        if (a>0 && b>0){
            length = a;
            breadth = b;
        }else{
            length = 1;
            breadth = 1;
        }
    }
    public int area(){
        return length*breadth;
    }

}


public class Chapter11_Constructors_practice {
    public static void main(String[] args) {
        Rectange2 r1 = new Rectange2(10 , 5);
        
        System.out.println(r1.area());
    }
}
