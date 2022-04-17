public class BitwiseMasking {
    public static void main(String[] args) {
        // I am going to store both 12 and 9 in c as 4 bits each.
        byte a = 12,b = 9 ;
        byte c = 0;
        // System.out.println(String.format("%s", Integer.toBinaryString(c)));
        c = (byte)(a<<4);
        System.out.println(String.format("%s", Integer.toBinaryString(c)));
        c = (byte)(c|b);
        System.out.println(String.format("%s", Integer.toBinaryString(c)));

    }
}
