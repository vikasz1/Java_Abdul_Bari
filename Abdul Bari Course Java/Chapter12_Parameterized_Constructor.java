class Parent1{
    public Parent1(){
        System.out.println("Non parameterized parent");
    }
    public Parent1(int x){
        System.out.println("Parameterised parent");
    }
}

class Child1 extends Parent1{
    public Child1(){
        System.out.println("Non parameterized child");
    }
    public Child1(int x,int y){
        super(x);
        System.out.println("Parameterised child");
    }
    
}

public class Chapter12_Parameterized_Constructor {
    public static void main(String[] args) {
        Child1 ch = new Child1(34,12);

    }
}