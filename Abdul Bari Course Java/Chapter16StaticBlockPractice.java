
public class Chapter16StaticBlockPractice {
    static int a = 5;

    static{
        System.out.println(a);
        System.out.println("Block A");
    }
    static{
        System.out.println("Block B");
    }
    public static void main(String[] args) {
        System.out.println("I will be executed last.");
    }
}
