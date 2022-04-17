public class BitwiseSwapping {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);        
        System.out.println(b);        
    }
}
