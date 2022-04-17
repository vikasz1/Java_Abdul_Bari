public class Chapter2Bytes  {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.BYTES);


        byte b = 15; //    -128to127
        short s = 150; //  -32128 to 32127
        int i = 1200; // for longer numbers
        float f  = 25.5f;
        System.out.println(f);
        System.out.println(b);
        System.out.println(i);
        System.out.println(s);
    }
}
