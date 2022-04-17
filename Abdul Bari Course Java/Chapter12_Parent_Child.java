class Parent{
    public Parent(){
        System.out.println("Parent Constructor invoked");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child constructor invoked");
    }
}


public class Chapter12_Parent_Child {
    public static void main(String[] args) {
        Child ch = new Child();
        
    }
}
