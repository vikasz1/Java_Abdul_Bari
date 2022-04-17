public class BitwiseDemonstration {
    public static void main(String[] args) {
        int a = -0b1010;
        int b = 0b1000;
        int c  = 0b1010;
        int d =  ~c;
        int y = a>>1;
        System.out.println(String.format("%s", Integer.toBinaryString(a)));
        System.out.println(a&b);
        System.out.println("NOT of 10 is: "+d);
    
    }
}
